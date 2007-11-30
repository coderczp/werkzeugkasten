package com.google.werkzeugkasten.sqlparser.impl;

import com.google.werkzeugkasten.sqlparser.SqlExecutionContext;
import com.google.werkzeugkasten.sqlparser.Status;

public class Literal extends AbstractToken {

	public Literal(int offset) {
		super(offset);
	}

	public Status execute(SqlExecutionContext parameter) {
		parameter.getBuffer().append(parameter.getFullText(), getOffset(),
				getLength());
		return Status.Success;
	}

}
