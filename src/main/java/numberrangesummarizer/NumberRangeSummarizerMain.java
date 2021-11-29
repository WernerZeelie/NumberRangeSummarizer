package numberrangesummarizer;

import java.util.*;

public class NumberRangeSummarizerMain implements NumberRangeSummarizer{
    public static void main(String[] args) {
    }

    @Override
    public Collection<Integer> collect(String input) {
        Collection<Integer> myList = new ArrayList<>();
        StringBuilder builder = new StringBuilder(input);
        String format = builder.toString().replaceAll(","," ");
        String form[] = format.split("\\s");
        for(String s: form){
            myList.add(Integer.parseInt(s));
        }

        return myList;
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {

        StringBuilder builder = new StringBuilder();
        List<Integer> range = new ArrayList<>(input);

        int previous = range.get(0);
        int start = previous;

        for(int i: range.subList(1, range.size())){
            if (previous + 1 != i){
                append(builder,start,previous).append(", ");
                start = i;
            }
            previous = i;
        }

        String summary = append(builder, start, previous).toString();
        System.out.println(summary);
      return summary;
    }


    private static StringBuilder append(StringBuilder builder, int start, int previous) {
        builder.append(start);
        if(start != previous) {
            builder.append(previous - start > 1 ? "-" : ", ").append(previous);
        }
        return builder;
    }

}
