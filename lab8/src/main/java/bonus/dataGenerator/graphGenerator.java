package bonus.dataGenerator;

import bonus.Database;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class graphGenerator {

    public graphGenerator() {

    }

    /**
     * this method generates a Graph based on sisterhoods between generated cities
     *
     * @return Graph with connections between cities
     */
    public Graph generate() {
        Graph<Integer, DefaultEdge> graph = new SimpleGraph<>(DefaultEdge.class);
        try {
            Connection con = Database.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT sister1, sister2 FROM sisterhoods");
            if (rs == null)
                return null;
            while (rs.next()) {
                graph.addVertex(rs.getInt(1));
                graph.addVertex(rs.getInt(2));
                graph.addEdge(rs.getInt(1), rs.getInt(2));
            }
            return graph;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
