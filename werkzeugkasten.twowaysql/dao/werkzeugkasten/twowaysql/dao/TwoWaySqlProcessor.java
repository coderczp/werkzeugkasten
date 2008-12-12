package werkzeugkasten.twowaysql.dao;

import werkzeugkasten.twowaysql.error.QueryProblemException;
import werkzeugkasten.twowaysql.jdbc.SQLRuntimeException;

public interface TwoWaySqlProcessor {

	<LC, EC, R> R process(LC loadingContext, EC expressionContext,
			ResultSetMapper<R> rsm) throws QueryProblemException,
			SQLRuntimeException;
}
