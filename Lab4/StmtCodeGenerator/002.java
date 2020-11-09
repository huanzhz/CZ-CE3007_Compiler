	/** Generates code for a break statement. */
	@Override
	public Void visitBreakStmt(BreakStmt nd) {
		/* TODO: generate code for break statement (hint: use ASTNode.getEnclosingLoop and breakTargets;
		 *       use units.add() to insert the statement into the surrounding method) */
		
		Unit breakStatement = breakTargets.get(nd.getEnclosingLoop());
		units.add(j.newGotoStmt(breakStatement));
		
		return null;
	}
	
	/** Generates code for a while statement. */
	@Override
	public Void visitWhileStmt(WhileStmt nd) {
		/* TODO: generate code for while statement as discussed in lecture; add the NOP statement you
		 *       generate as the break target to the breakTargets map
		 */
		NopStmt check = j.newNopStmt(); //check condition point
		NopStmt exit = j.newNopStmt(); //exit while loop
		
		breakTargets.put(nd, exit); //break statement
		
		units.add(check);  //back to check while condition
		
		Value cond = ExprCodeGenerator.generate(nd.getExpr(), fcg);
		units.add(j.newIfStmt(j.newEqExpr(cond, IntConstant.v(0)), exit));
		
		nd.getBody().accept(this); //while loop body
		
		units.add(j.newGotoStmt(check)); //go back to check while condition
		
		units.add(exit);  //exit while loop
		
		return null;
	}