package werkzeugkasten.twowaysql.tree;


public class TextNode extends AbstractQueryNode {

	public NodeType getType() {
		return NodeType.TXTNODE;
	}

	public <P> void accept(QueryTreeVisitor<P> visitor, P parameter) {
		visitor.visit(this, parameter);
	};
}
