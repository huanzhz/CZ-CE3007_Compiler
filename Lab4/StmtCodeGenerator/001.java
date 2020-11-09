	/** Generates code for an expression statement. */
	@Override
	public Void visitExprStmt(ExprStmt nd) {
		/* TODO: generate code for expression statement (hint: use ExprCodeGenerator.generate) */
		ExprCodeGenerator.generate(nd.getExpr(), fcg);
		return null;
	}
	
	/** Generates code for a break statement. */
	@Override
	public Void visitBreakStmt(BreakStmt nd) {
		/* TODO: generate code for break statement (hint: use ASTNode.getEnclosingLoop and breakTargets;
		 *       use units.add() to insert the statement into the surrounding method) */
		Unit breakTarget = breakTargets.get(nd.getEnclosingLoop());
		units.add(j.newGotoStmt(breakTarget));
		return null;
	}
	
	/** Generates code for a while statement. */
	@Override
	public Void visitWhileStmt(WhileStmt nd) {
		/* TODO: generate code for while statement as discussed in lecture; add the NOP statement you
		 *       generate as the break target to the breakTargets map
		 */
		NopStmt beginLabel = j.newNopStmt();
		NopStmt endLabel = j.newNopStmt();
		breakTargets.put(nd, endLabel);
		units.add(beginLabel);
		Value cond = ExprCodeGenerator.generate(nd.getExpr(), fcg);
		
		units.add(j.newIfStmt(j.newEqExpr(cond, IntConstant.v(0)), endLabel));
		nd.getBody().accept(this);
		units.add(j.newGotoStmt(beginLabel));
		units.add(endLabel);
		
		return null;
	}