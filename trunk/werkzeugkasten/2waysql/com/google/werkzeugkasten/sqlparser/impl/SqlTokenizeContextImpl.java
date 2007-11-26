package com.google.werkzeugkasten.sqlparser.impl;

import java.util.Arrays;
import java.util.List;

import com.google.werkzeugkasten.sqlparser.SqlTokenizeContext;
import com.google.werkzeugkasten.sqlparser.TokenKind;

public class SqlTokenizeContextImpl extends
		AbstractSqlParserContext<SqlTokenizeContext> implements
		SqlTokenizeContext {

	protected TokenKind[] tokens;

	public SqlTokenizeContextImpl(String fulltext) {
		super(fulltext);
		tokens = new TokenKind[fulltext.length()];
	}

	public List<TokenKind> getTokens() {
		return Arrays.asList(this.tokens);
	}

	public void setToken(int index, TokenKind kind) {
		this.tokens[index] = kind;
	}

}
