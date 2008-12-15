package werkzeugkasten.twowaysql.dao.base.binder;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import werkzeugkasten.twowaysql.dao.Binder;

public class BooleanBinder implements Binder {

	protected Boolean value;

	public BooleanBinder(Boolean value) {
		this.value = value;
	}

	@Override
	public void bind(PreparedStatement ps, int index) throws SQLException {
		ps.setBoolean(index, value);
	}

}
