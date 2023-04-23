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
 * on 23/04/23
 **/

public class OptimalSolution implements Solution {
    @Override
    public List<Pair> mergeOverlappingSubArrays(List<Pair> list) {
        Collections.sort(list, Comparator.comparingInt(Pair::getStart));
        List<Pair> result = new ArrayList<>();

        int start = list.get(0).getStart();
        int end = list.get(0).getEnd();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStart() <= end) {
                end = Utility.MaxOf(end, list.get(i).getEnd());
            } else {
                result.add(new Pair(start, end));
                start = list.get(i).getStart();
                end = list.get(i).getEnd();
            }
        }
        result.add(new Pair(start, end));
        return result;
    }
}
