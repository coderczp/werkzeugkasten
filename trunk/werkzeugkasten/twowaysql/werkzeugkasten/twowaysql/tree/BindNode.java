package werkzeugkasten.twowaysql.tree;

public class BindNode extends AbstractQueryNode {

	public NodeType getType() {
		return NodeType.BINDNODE;
	}

	public <C> void accept(QueryTreeVisitor<C> visitor, C context) {
		visitor.visit(this, context);
	};
}
