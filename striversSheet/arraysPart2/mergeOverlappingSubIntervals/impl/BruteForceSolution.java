package takeUForward.striversSheet.arraysPart2.mergeOverlappingSubIntervals.impl;

import takeUForward.striversSheet.arraysPart2.mergeOverlappingSubIntervals.Pair;
import takeUForward.striversSheet.arraysPart2.mergeOverlappingSubIntervals.Solution;
import utils.Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * created by JK
 * on 21/04/23
 **/

public class BruteForceSolution implements Solution {
    @Override
    public List<Pair> mergeOverlappingSubArrays(List<Pair> list) {

        list.sort(Comparator.comparingInt(Pair::getStart));
//        list.sort((a,b)->Integer.compare(a.getStart(),b.getStart()));
        List<Pair> result = new ArrayList<>();
        int start = 0;
        int end = 0;
        for (int i = 0; i < list.size(); i++) {
            Pair t = list.get(i);
            start = t.getStart();
            end = t.getEnd();

            if (!result.isEmpty() && start <= result.get(result.size() - 1).getEnd()) {
                continue;
            }
            for (int j = i + 1; j < list.size(); j++) {
                Pair p = list.get(j);
                if (p.getStart() <= end) {
                    end = Utility.MaxOf(end, p.getEnd());
                }
            }

            end = Utility.MaxOf(end, t.getEnd());
            result.add(new Pair(start, end));
        }

        return result;
    }
}
