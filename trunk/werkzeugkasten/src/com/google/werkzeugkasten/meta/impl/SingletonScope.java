package com.google.werkzeugkasten.meta.impl;

import com.google.werkzeugkasten.meta.ChainContext;
import com.google.werkzeugkasten.meta.Initializable;
import com.google.werkzeugkasten.meta.ScopeProvider;

public interface SingletonScope<R, CTX extends ChainContext<R>> extends
		ScopeProvider.Writable<R, CTX>, Initializable {

}
