package Barcellano;

import java.util.ArrayList;
import java.util.List;

public class fourTenPinBowling {
    /**
     * <i> In the game of ten-pin bowling, a player rolls a bowling ball down a lane
     * to knock over pins.
     * There are ten pins set at the end of the bowling lane.
     * Each player has 10 frames to roll a bowling ball down a lane and knock over
     * as many pins as possible.
     * The first nine frames are ended after two rolls or when the player knocks
     * down all the pins.
     * The last frame a player will receive an extra roll every time they knock down
     * all ten pins; up to a maximum of three total rolls. </i>
     */

    public static int tenPinBowling(String f) {
        Integer score = 0;
        List<Integer> rolls = new ArrayList<>();
        String[] frames = f.split(" ");
        for (String frame : frames) {
            String[] balls = frame.split("");
            for (String ball : balls) {
                if (ball.matches("X"))
                    rolls.add(10);
                else if (ball.matches("/"))
                    rolls.add(10 - rolls.get(rolls.size() - 1));
                else
                    rolls.add(Integer.valueOf(ball));
            }
        }
        rolls.add(0);
        rolls.add(0);

        Integer frame = 0;
        for (int i = 0; i < 10; i++) {
            Integer point = rolls.get(frame);
            Integer nPoint = rolls.get(frame + 1);
            Integer nnPoint = rolls.get(frame + 2);
            if (point == 10) {
                score += 10 + (nPoint + nnPoint);
                frame++;
            } else if ((point + nPoint) == 10) {
                score += 10 + (nnPoint);
                frame += 2;
            } else {
                score += point + nPoint;
                frame += 2;
            }
        }

        return score;
    }
}
