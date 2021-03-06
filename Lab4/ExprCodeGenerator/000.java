	/** Generate code for an integer literal. */
	@Override
	public Value visitIntLiteral(IntLiteral nd) {
		/* TODO: return something meaningful here */
		return IntConstant.v(nd.getValue());
	}
	
	/** Generate code for a string literal. */
	@Override
	public Value visitStringLiteral(StringLiteral nd) {
		/* TODO: return something meaningful here */
		return StringConstant.v(nd.getValue());
	}
	
	/** Generate code for a Boolean literal. */
	@Override
	public Value visitBooleanLiteral(BooleanLiteral nd) {
		/* TODO: return something meaningful here (hint: translate 'true' to integer
		 *       constant 1, 'false' to integer constant 0) */
		Boolean result = nd.getValue();
		int i = result ? 1: 0;
		return IntConstant.v(i);
	}
	
	/** Generate code for an array index expression. */
	@Override
	public Value visitArrayIndex(ArrayIndex nd) {
		/* TODO: generate code for array index */
		/*
		x[5]
		b[4][7]
		a[i+1]
		*/
		Value base = wrap(nd.getBase().accept(this));			//2d array?
		Value index = wrap(nd.getIndex().accept(this));
		return Jimple.v().newArrayRef(base, index);
	}
	
	/** Generate code for a binary expression. */
	@Override
	public Value visitBinaryExpr(BinaryExpr nd) {
		/* TODO: generate code for binary expression here; you can either use a visitor
		 *       to determine the type of binary expression you are dealing with, or
		 *       generate code in the more specialised visitor methods visitAddExpr,
		 *       visitSubExpr, etc., instead
		 */
		final Value left = wrap(nd.getLeft().accept(this)),
				right = wrap(nd.getRight().accept(this));
		
		Value res = nd.accept(new Visitor<Value>() {
			@Override
			public Value visitAddExpr(AddExpr nd) {
				return Jimple.v().newAddExpr(left,right);
			}
			@Override
			public Value visitSubExpr(SubExpr nd) {
				return Jimple.v().newSubExpr(left, right);
			}
			@Override
			public Value visitMulExpr(MulExpr nd) {
				return Jimple.v().newMulExpr(left, right);
			}
			@Override
			public Value visitDivExpr(DivExpr nd) {
				return Jimple.v().newDivExpr(left, right);
			}
			@Override
			public Value visitModExpr(ModExpr nd) {
				return Jimple.v().newRemExpr(left, right);
			}
		});
			
		return res;
	}
	
	/** Generate code for a negation expression. */
	@Override
	public Value visitNegExpr(NegExpr nd) {
		/* TODO: generate code for negation expression */
		Value op = wrap(nd.getOperand().accept(this)); 
		
		return Jimple.v().newNegExpr(op);
	}