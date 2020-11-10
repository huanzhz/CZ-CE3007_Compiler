	/** Generate code for an array index expression. */
	@Override
	public Value visitArrayIndex(ArrayIndex nd) {
		/* DONE: generate code for array index */
		// get array reference
		final Value index = this.wrap(nd.getIndex().accept(this));
		final Value base = this.wrap(nd.getBase().accept(this)); 
		System.out.println(base);
		return Jimple.v().newArrayRef(base, index);
	}