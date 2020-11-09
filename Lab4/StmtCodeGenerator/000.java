	/** Generates code for a break statement. */
	@Override
	public Void visitBreakStmt(BreakStmt nd) {
		/* TODO: generate code for break statement (hint: use ASTNode.getEnclosingLoop and breakTargets;
		 *       use units.add() to insert the statement into the surrounding method) */
		WhileStmt parent = nd.getEnclosingLoop();
		Unit exit_ = breakTargets.get(parent);
		units.add( j.newGotoStmt(exit_) );
		return null;
	}
	
	/** Generates code for a while statement. */
	@Override
	public Void visitWhileStmt(WhileStmt nd) {
		/* TODO: generate code for while statement as discussed in lecture; add the NOP statement you
		 *       generate as the break target to the breakTargets map
		 */
		/*
		start_
		c = ...
		if c == 0 goto exit_
		...
		goto start_
		exit_
		 */
		NopStmt start_ = j.newNopStmt();
		NopStmt exit_ = j.newNopStmt();

		//update the HashMap for breakstmt
		breakTargets.put(nd, exit_);			//MUST PUT BEFORE ENTERING BODY. IF NOT FAILLLLL
		
		units.add(start_);

		Value cond = ExprCodeGenerator.generate(nd.getExpr(), fcg);
		units.add(j.newIfStmt(j.newEqExpr(cond, IntConstant.v(0)), exit_));

		nd.getBody().accept(this);
		
		units.add(j.newGotoStmt(start_));
		units.add(exit_);

		
		return null;
	}