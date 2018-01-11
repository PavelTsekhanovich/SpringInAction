package by.spring.action;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class ContestantIntroducer {

    @DeclareParents(
            value = "by.spring.action.Performer+",
            defaultImpl = GraciousContestant.class)
    public static Contestant contestant;
}