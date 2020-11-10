	/** Generates code for a break statement. */
	@Override
	public Void visitBreakStmt(BreakStmt nd) {
		/* TODO: generate code for break statement (hint: use ASTNode.getEnclosingLoop and breakTargets;
		 *       use units.add() to insert the statement into the surrounding method) */
		//break statements are used to break out of loops, therefore there should be a parent while statement

		//use getEnclosingLoop to find the while loop the break statement is in
		WhileStmt parentStatement = nd.getEnclosingLoop();		
		//find the point to break out of loop
		Unit exitPoint = breakTargets.get(parentStatement);
		
		//insert break statement into method?
		units.add(j.newGotoStmt(exitPoint));

		return null;

	}
	
	/** Generates code for a while statement. */
	@Override
	public Void visitWhileStmt(WhileStmt nd) {
		/* TODO: generate code for while statement as discussed in lecture; add the NOP statement you
		 *       generate as the break target to the breakTargets map
		 */

		/*INPUT: while statement
		label0 = new NOP statement
		label1 = new NOP statement
		emit statement label0
		c = generate code for condition (storing in a temporary variable
		if condition is a complex expression)
		emit statement if c == 0 goto label1
		generate code for body
		emit statement goto label0
		emit statement label1*/
		
		NopStmt label0 = j.newNopStmt(); // start of loop || loop back to here
		NopStmt label1 = j.newNopStmt(); //where u break out of loop
		
		//use HashMaps to find the break statement
		//hashmaps uses format <key,value>
		breakTargets.put(nd, label1);// break out of loop and go to desired location
		
		units.add(label0); //go back to start of loop
		
		Value condition = ExprCodeGenerator.generate(nd.getExpr(), fcg); // condition to check for while looping

		// check if c==0
		EqExpr equals = j.newEqExpr(condition, IntConstant.v(0));
		soot.jimple.IfStmt ifCondition = j.newIfStmt(equals, label1); 
		units.add(ifCondition);
		
		//add to statement list
		nd.getBody().accept(this);
		units.add(j.newGotoStmt(label0));
		units.add(label1);
		
		return null;
	}