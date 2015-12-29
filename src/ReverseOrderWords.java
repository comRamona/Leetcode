/**
 * Created by rama on 29/12/15.
 * <p>
 * This time reverse order of words
 * sky is blue
 * blue is sky
 */
public class ReverseOrderWords {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        StringBuilder word = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != ' ')
                word.append(c);
            else {
                if (!word.toString().equals("")) {
                    StringBuilder reverse = word.reverse();
                    sb.append(reverse);
                    sb.append(c);
                }
                word = new StringBuilder();
            }

        }
        StringBuilder reverse = word.reverse();
        sb.append(reverse);
        return sb.toString().trim();

    }

    public static void main(String[] args) {
        System.out.println(reverseWords("\"kabeawa?n?sr? iqtwwb'rqhxmhrv?ktxrw!tvb.bzvtvbdgdyg,j.k?bjji.c' hkuuqee!!jgfben!'lsnojrop!ls,v?h'!ihr " +
                "ixewdsu!r.wlidet!uo.f,mfhhta,wafh .gocsdoz,rx?pbpwzicifoamocdin?gwjyxejrqvp?. ealmxazdvtowllpo'rafnizz?gki.e.rdvbq.b.nsdwzsldk! " +
                ".rjpdr'nv,ztqk'ynkfufz,pz'pltdhdxg,ktpjoylkyq,pxvt d.g?whtt!.exdcp,ahqp.,iocimmq xj,n''zpbeuzcg.ze'm jl,w.?e'vuwf?kt??ebxkwssk.qbkgbm'tq! " +
                "qi wuz vgi ffkgidkvozp?b'cun'fjeuwbhxxni?jchivekgc?yh vx,r,?mxud.i!qqdywurs ?gml'srabxu'nc.kln?!p!mi d!dhffqlmxfglucwxlnrdffar.,w!zkycnbp'ol,?jchfu.c" +
                " b!sdcocc xrl?xjvi tgetzayit.xkfkbhgfj!'ndp hl?c b.sh.piyf?q?n,yw.cp!!anlot?hzt.sn,dcgc',tydu b '.!.tr?wv,wbh,!aztlcakittrdhta''zhxp?." +
                " sqciorjnunzmaty,gqmrtrmnhxapmfwfsjnmrazudad.b?tr.z.qcfgcva'd ke!bh.y. fhyosrtflrn?rcgkjmqh.iirnem?asfaicvaos'fohqilallmdr. dhxlnt!"));

    }

    public String reverseWords2(String s) {
        String[] words = s.trim().split(" +");
        for (int i = 0; i < words.length / 2; i++) {
            String w = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = w;
        }
        return String.join(" ", words);
    }
}