package lecture7.monster;

import lecture7.skill.RazorLeaf;
import lecture7.skill.Skill;
import lecture7.skill.Tackle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Turtle extends Monster{
    private static final List<Skill> skills = new ArrayList<>(Arrays.asList(new Tackle(), new RazorLeaf()));
    public Turtle() {
        super("Turtle", 55, 17, 16, 15, skills);
    }
}
