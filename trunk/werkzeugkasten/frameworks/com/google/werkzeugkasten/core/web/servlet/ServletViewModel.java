package com.google.werkzeugkasten.core.web.servlet;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.werkzeugkasten.core.web.ViewModel;

public interface ServletViewModel<CTX extends ServletWebContext> extends
		ViewModel<ServletContext, HttpServletRequest, HttpServletResponse, CTX> {

}
