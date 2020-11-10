	/** Generate code for an array index expression. */
	@Override
	public Value visitArrayIndex(ArrayIndex nd) {
		/* TODO: generate code for array index */
		//use jimple.newArrayRef(a,i) however, need to do recursively to solve for more than 1 dimension array
		//base[index] in the form of a[i]
		//use a temp value for storing values for multi-dimensional array

		//converting base into value
		Value base = this.wrap(nd.getBase().accept(this));
		//index to value
		Value index = this.wrap(nd.getIndex().accept(this));


		return Jimple.v().newArrayRef(base,index);
	}