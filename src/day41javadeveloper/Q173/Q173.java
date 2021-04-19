//package Q173;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Q173 {
//    /*
//    Given:*/
//    List<String> longList = List.of("Hello", "World", "Beat");
//    List<String> shortList = new ArrayList<>();
//
//    /*Which code fragment correctly forms a short list of words containing the letter “e”?
//     */
//    /*A*/
//    longList.stream()
//            .filter(w->w.indexOf('e')!=-1)
//            .parallel()
//            .forEach(w->shortList.add(w));
//
//    /*B*/
//
//    longList.parallelStream()
//            .filter(w->w.indexOd('e') != -1)
//            .forEach(w->shortList.add(w));
//    /*C*/
//    shortList = longList.stream()
//        .filter(w-> w.indexOf('e') != -1)
//        .parallel()
//        .collect(Collectors.toList());
//
//    /*D*/
//    longList.stream()
//        .filter(w-> w.indexOf('e') != -1)
//        .parallel()
//        .collect(shortList);
//
//
//    /*
//        A. Option A
//        B. Option B
//        C. Option C
//        D. Option D
//
//        answer : C
//     */
//
//
//}
