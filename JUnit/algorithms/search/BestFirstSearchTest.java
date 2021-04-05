<<<<<<< HEAD
package algorithms.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestFirstSearchTest {


    @Test
    void getName() {
        BestFirstSearch bestFirstSearch = new BestFirstSearch();
        assert (bestFirstSearch.getName().equals("Best First Search"));
    }

    @Test
    void solve() {

    }
}
||||||| 45004d8
=======
package algorithms.search;

import algorithms.mazeGenerators.EmptyMazeGenerator;
import algorithms.mazeGenerators.IMazeGenerator;
import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.MyMazeGenerator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BestFirstSearchTest {

    @Test
    void getName() {
        BestFirstSearch BestFS= new BestFirstSearch();
        assertEquals("Best First Search",BestFS.getName());
    }

    @Test
    void solve() {

            IMazeGenerator mg = new MyMazeGenerator();
            BestFirstSearch BestFS= new BestFirstSearch();
            Maze regularMaze = mg.generate(10,10);
            SearchableMaze searchableMaze = new SearchableMaze(regularMaze);
            Solution solution=BestFS.solve(searchableMaze);
            assertNotEquals(null,solution);
            assertNotEquals(0,solution);

          //  Maze EmptyMaze = mg.generate(0,0);
          //  SearchableMaze searchableMaze2 = new SearchableMaze(EmptyMaze);

         //   Solution solution2=BestFS.solve(searchableMaze2);
          //  assertEquals(null,solution2);
         //   assertNotEquals(0,solution2);



        }
    }
>>>>>>> 1505b297b9630f60bf9c7ba2cbf95785e99d6f00
