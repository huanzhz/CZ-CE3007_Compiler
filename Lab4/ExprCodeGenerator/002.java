	/** Generate code for a Boolean literal. */
	@Override
	public Value visitBooleanLiteral(BooleanLiteral nd) {
		/* TODO: return something meaningful here (hint: translate 'true' to integer
		 *       constant 1, 'false' to integer constant 0) */
		return IntConstant.v(nd.getValue() ? 1: 0);
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
				return Jimple.v().newAddExpr(left, right);
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
	
	