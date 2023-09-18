import javax.swing.text.html.Option;
import java.util.Optional;

public class Tree {
    private Optional<Object>[] _root;
    private Tree[] _subtrees;

    public Tree(Optional<Object>[] root, Optional<Tree[]> subtrees) {
        _root = root;
        if (subtrees.isPresent()) {
            _subtrees = subtrees.get();
        }
    }

    public boolean is_empty() {
        return _root.length == 0;
    }
}
