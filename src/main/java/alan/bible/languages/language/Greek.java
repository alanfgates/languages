package alan.bible.languages.language;

import alan.bible.languages.Language;
import alan.bible.languages.Word;
import alan.bible.languages.WordSet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gates on 5/22/15.
 */
public class Greek extends Language {
  @Override
  public String getName() {
    return "Greek";
  }

  @Override
  public WordSet getInitialGrammarRules() {
    return null;
  }

  @Override
  public WordSet getInitialVerbs() {
    List<Word> words = new ArrayList<>();
    AbbreviationDecoder verbDecoder = new GreekVerbAbbreviationDecoder();
    addWord(words, verbDecoder, 4440, "ἔλυσα", "I loosened-iAa1n", "ἔλυσας", "you loosened-iAa2n",
        "ἔλυσε", "s/he loosened-iAa3n", "ἐλύσαμεν", "we loosened-iAa1l",  "ἐλύσατε",
        "you loosened-iAa2l", "ἔλυσαν", "they loosened-iAa3l",
        "ἔβαλον", "I/they threw-iAt1n/3l", "ἔβαλες", "you threw-iAt2n",
        "ἔβαλε", "s/he threw-iAt3n", "ἐβάλομεν", "we threw-iAt1l",
        "ἐβάλετε", "you threw-iAt2l");
    addWord(words, verbDecoder, 4070, "λύω", "I loosen/I might loosen-isAr1n",
        "λύεις", "you loosen-iAr2n", "λύει", "s/he loosens-iAr3n", "λύομεν", "we loosen-iAr1l",
        "λύετε", "you loosen/loosen!-imAr2l",
        "λύουσι", "they loosen/loosening-iAr3l/pAr-mnDp", "λύουσιν", "they loosen/loosening-iAr3l/pAr-mnDp");
    addWord(words, verbDecoder, 2590, "λύων", "loosening-pAr-mNs",
        "λύοντος", "loosening-pAr-mnGs", "λύοντι", "loosening-pAr-mnDs",
        "λύοντα", "loosening-pAr-mAs/nNAp", "λύουσα", "loosening-pAr-fNs",
        "λυούσης", "loosening-pAr-fGs", "λυούσῃ", "loosening-pAr-fDs",
        "λύουσαν", "loosening-pAr-fAs", "λῦον", "loosening-pAr-nNAs",
        "λύοντες", "loosening-pAr-mNp", "λύοντων", "loosening-pAr-mnGp",
        "λύοντας", "loosening-pAr-mAp", "λύουσαι", "loosening-pAr-fNp",
        "λυουσῶν", "loosening-pAr-fGp", "λυούσαις", "loosening-pAr-fDp",
        "λυούσας", "loosening-pAr-fAp");
    addWord(words, verbDecoder, 1480, "λύσας", "loosening-pAa-mNs",
        "λύσαντος", "loosening-pAa-mnGs", "λύσαντι", "loosening-pAa-mnDs",
        "λύσαντα", "loosening-pAa-mAs/nNAp", "λύσαντες", "loosening-pAa-mNp",
        "λυσάντων", "loosening-pAa-mnGp", "λύσασι", "loosening-pAa-mnDp",
        "λύσασιν", "loosening-pAa-mnDp", "λύσαντας", "loosening-pAa-mAp",
        "λύσασα", "loosening-pAa-fNs", "λυσάσης", "loosening-pAa-fGs",
        "λυσάσῃ", "loosening-pAa-fDs", "λύσασαν", "loosening-pAa-fAs",
        "λύσασαι", "loosening-pAa-fNp", "λυσασῶν", "loosening-pAa-fGp",
        "λυσάσαις", "loosening-pAa-fDp", "λυσάσας", "loosening-pAa-fAp",
        "λῦσαν", "loosening-pAa-nNAs", "βαλών", "throwing-pAt-mNs",
        "βαλόντος", "throwing-pAt-mnGs", "βαλόντι", "throwing-pAt-mnDs",
        "βαλόντα", "throwing-pAt-mAs", /* TODO expect this is neuter plural too */"βαλόντες", "throwing-pAt-mNp",
        "βαλόντων", "they must throw!/throwing-mAt3l/pAt-mnGp", "βαλοῦσι", "throwing-pAt-mnDp",
        "βαλοῦσιν", "throwing-pAt-mnDp", "βαλόντας", "throwing-pAt-mAp",
        "βαλοῦσα", "throwing-pAt-fNs", "βαλούσης", "throwing-pAt-fGs",
        "βαλούσῃ", "throwing-pAt-fDs", "βαλοῦσαν", "throwing-pAt-fAs",
        "βαλοῦσαι", "throwing-pAt-fNp", "βαλουσῶν", "throwing-pAt-fGp",
        "βαλούσαις", "throwing-pAt-fDp", "βαλούσας", "throwing-pAt-fAp",
        "βαλόν", "throwing-pAt-nNAs");
    addWord(words, verbDecoder, 1430, "λύομαι", "I loose myself/was loosened-iMPr1n",
        "λύῃ", "you loose yourself/were loosened-iMPr2n",
        "λύει", "you loose yourself/were loosened-iMPr2n",
        "λύεται", "he looses himself/was loosened-iMPr3n",
        "λυόμεθα", "we loose ourselves/were loosened-iMPr1l",
        "λύεσθε", "you loose yourselves/were loosened-iMPr2l",
        "λύονται", "they loose themselves/were loosened-iMPr3l");
    addWord(words, verbDecoder, 1275, "ἔλυον", "I was/they were loosening-iAe1n/3l",
        "ἔλυες", "you were loosening-iAe2n", "ἔλυε", "s/he was loosening-iAe3n",
        "ἔλυεν", "s/he was loosening-iAe3n", "ἐλύομεν", "we were loosening-iAe1l",
        "ἐλύετε", "you were loosening-iAe2l");
    addWord(words, verbDecoder, 1184, "λύσω", "I will/might loosen-iAu1n/sAa1n",
        "λύσεις", "you will loosen-iAu2n", "λύσει", "s/he will loosen-iAu3n",
        "λύσομεν", "we will loosen-iAu1l", "λύσετε", "you will loosen-iAu2l",
        "λύσουσι", "they will loosen-iAu3l", "λύσουσιν", "they will loosen-iAu3l");
    addWord(words, verbDecoder, 910, "λυόμενος", "loosening oneself/being loosened-pMPr-mNs",
        "λυόμενον", "loosening oneself/being loosened-pMPr-mAs/nNAs",
        "λυόμενου", "loosening oneself/being loosened-pMPr-mnGs",
        "λυόμενῳ", "loosening oneself/being loosened-pMPr-mnDs",
        "λυομένη",  "loosening oneself/being loosened-pMPr-fNs",
        "λυομένην",  "loosening oneself/being loosened-pMPr-fAs",
        "λυομένης",  "loosening oneself/being loosened-pMPr-fGs",
        "λυομένῃ",  "loosening oneself/being loosened-pMPr-fDs",
        "λυομένοι",  "loosening oneself/being loosened-pMPr-mNp",
        "λυομένους",  "loosening oneself/being loosened-pMPr-mAp",
        "λυόμενων", "loosening oneself/being loosened-pMPr-mfnGp",
        "λυόμενοις", "loosening oneself/being loosened-pMPr-mnDp",
        "λυομέναι",  "loosening oneself/being loosened-pMPr-fNp",
        "λυομένᾱς",  "loosening oneself/being loosened-pMPr-fAp",
        "λυόμεναις", "loosening oneself/being loosened-pMPr-fDp",
        "λυόμενα", "loosening oneself/being loosened-pMPr-nNAp");
    addWord(words, verbDecoder, 888,
        "λύσῃς", "you might loosen-sAa2n", "λύσῃ", "s/he might loosen-sAa3n",
        "λύσωμεν", "we might loosen-sAa1l", "λύσητε", "you might loosen-sAa2l",
        "λύσωσι", "they might loosen-sAa3l", "βάλω", "I might throw-sAt1n",
        "βάλῃς", "you might throw-sAt2n", "βάλῃ", "s/he might throw-sAt3n",
        "βάλωμεν", "we might throw-sAt1l", "βάλητε", "you might throw-sAt2l",
        "βάλωσι", "they might throw-sAt3l");
    addWord(words, verbDecoder, 840, "ἐλυσάμην", "I loosed myself-iMa1n",
        "ἐλύσω", "you loosed yourself-iMa2n", "ἐλύσατο", "s/he loosed himself-iMa3n",
        "ἐλυσάμεθα", "we loosed ourselves-iMa1l", "ἐλύσασθε", "you loosed yourselves-iMa2l",
        "ἐλύσαντο", "they loosed themselves-iMa3l");
    addWord(words, verbDecoder, 740, "λῦσαι", "to loosen-fAa", "βαλεῖν", "to throw-fAt");
    addWord(words, verbDecoder, 720, "ἐλύθην", "I was loosed-iPa1n",
        "ἐλύθης", "you were loosed-iPa2n", "ἐλύθη", "s/he was loosed-iPa3n",
        "ἐλύθημεν", "We were loosed-iPa1l", "ἐλύθητε", "you were loosed-iPa2l",
        "ἐλύθησαν", "they were loosed-iPa3l", "ἐγράφην", "I was written-iPt1n",
        "ἐγράφης", "you were written-iPt2n", "ἐγράφη", "s/he was written-iPt3n",
        "ἐγράφημεν", "we were written-iPt1l", "ἐγράφητε", "you were written-iPt2l",
        "ἐγράφησαν", "they were written-iPt3l");
    addWord(words, verbDecoder, 666, "λύειν", "to loosen-fAr");
    addWord(words, verbDecoder, 592, "λῦε", "loosen!-mAr2n", "λυέτω", "he must loosen!-mAr3n",
        "λυόντων", "they must loosen!-mAr3l", "λυέτωσαν", "they must loosen!-mAr3l");
    addWord(words, verbDecoder, 592, "λέλυκα", "I have loosened-iAz1n",
        "λέλυκας", "you have loosened-iAz2n", "λέλυκε", "s/he has loosened-iAz3n",
        "λελύκαμεν", "we have loosened-iAz1l", "λελύκατε", "you have loosened-iAz2l",
        "λελύκασι", "they have loosened-iAz3l");
    addWord(words, verbDecoder, 518, "λῦσον", "loosen!-mAa2n", "λυσάτω", "he must loosen!-mAa3n",
        "λύσατε", "loosen!-mAa2l", "λυσάντων", "loosen!-mAa3l", "λυσάτωσαν", "loosen!-mAa3l",
        "βάλε", "throw!-mAt2n", "βαλέτω", "he must throw!-mAt3n", "βάλετε", "throw!-mAt2l",
        "βαλέτωσαν", "they must throw!-mAt3l");
    addWord(words, verbDecoder, 455, "ἐλυόμην", "I was loosening myself/I was loosened-iMPe1n",
        "ἐλύου", "you were loosening yourself/you were loosened-iMPe2n",
        "ἐλύετο", "s/he was loosening himself/s/he was loosened-iMPe3n",
        "ἐλυόμεθα", "we were loosening ourselves/we were loosened-iMPe1l",
        "ἐλύεσθε", "you were loosening yourselves/you were loosened-iMPe2l",
        "ἐλύοντο", "they were loosening themselves/they were loosened-iMPe3l");
    addWord(words, verbDecoder, 370, "λύῃς", "you might be loosening-sAr2n",
        "λύῃ", "s/he might be loosening-sAr3n", "λύωμεν", "we might be loosening-sAr1l",
        "λύητε", "you might be loosening-sAr2l", "λύωσι", "they might be loosening-sAr3l",
        "λύωσιν", "they might be loosening-sAr3l");
    // TODO 370 participle perfect active
    addWord(words, verbDecoder, 280, "λυσάμενος", "loosening oneself-pMa-mNs",
        "λυσάμενον", "loosening oneself-pMa-mAs/nNAs",
        "λυσάμενου", "loosening oneself-pMa-mnGs",
        "λυσάμενῳ", "loosening oneself-pMa-mnDs",
        "λυσάμένη",  "loosening oneself-pMa-fNs",
        "λυσάμένην",  "loosening oneself-pMa-fAs",
        "λυσάμένης",  "loosening oneself-pMa-fGs",
        "λυσάμένῃ",  "loosening oneself-pMa-fDs",
        "λυσάμένοι",  "loosening oneself-pMa-mNp",
        "λυσάμένους",  "loosening oneself-pMa-mAp",
        "λυσάμενων", "loosening oneself-pMa-mfnGp",
        "λυσάμενοις", "loosening oneself-pMa-mnDp",
        "λυσάμέναι",  "loosening oneself-pMa-fNp",
        "λυσάμένᾱς",  "loosening oneself-pMa-fAp",
        "λυόμεναις", "loosening oneself-pMa-fDp",
        "λυσάμενα", "loosening oneself-pMa-nNAp");
    return new WordSet(words);
  }

  @Override
  public WordSet getInitialNouns() {
    return null;
  }

  @Override
  public WordSet getInitialVocabulary() {
    List<Word> words = new ArrayList<>();

    AbbreviationDecoder nounDecoder = new GreekNounAbbreviationDecoder();
    AbbreviationDecoder verbDecoder = new GreekVerbAbbreviationDecoder();

    addWord(words, nounDecoder, 19904, "ὁ", "the-mNs", "τόν", "the-mAs", "τοῦ", "the-mnGs",
        "τῷ", "the-mnDs", "ἡ", "the-fNs", "τήν", "the-fAs", "τῆς", "the-fGs", "τῇ", "the-fDs",
        "τό", "the-nNAs", "ὁι", "the-mNp", "τούς", "the-mAp", "τῶν", "the-mfnGp", "τοῖς",
        "the-mnDp", "ἁι", "the-fNp", "τάς", "the-fAp", "ταῖς", "the-fDp", "τά", "the-nNAp");
    addWord(words, null, 9164, "καί", "and");
    addWord(words, null, 5601, "αὐτός", "he", "αὐτή", "she", "αὐτό", "it");
    addWord(words, nounDecoder, 2913, "συ", "you-Ns", "σε", "you-As", "σου", "your-s", "σοι",
        "you-Ds", "ὑμεις", "you-Np", "ὑμας", "you-Ap", "ὑμων", "your-p", "ὑμιν", "you-Dp");
    addWord(words, null, 2801, "δε", "weak but/yet, and");
    addWord(words, null, 2757, "ἐν dative", "in");
    addWord(words, nounDecoder, 2666, "ἐγώ", "I", "εμε", "me-Ae", "με", "me-A",  "εμου",
        "my-e", "μου", "my", "εμοι", "me-De", "μοι", "me-D", "ἡμεις", "we", "ἡμας", "us-A", "ἡμων",
        "our", "ἡμιν", "us-D");
    addWord(words, verbDecoder, 2656, "οὐ", "not-i", "οὐκ", "not-i", "οὐχ", "not-i", "μη", "not-mops");
    addWord(words, verbDecoder, 2462, "εἰμί", "I am-Ar", "εσομαι", "I will be εἰμί-Au");
    addWord(words, verbDecoder, 2357, "λεγω", "I say-Ar", "ερω", "I will say λεγω-Au",
        "ειπον", "I said λεγω-Aa", "ειρηκα", "I have said λεγω-Az",
        "ειρημαι", "I have been said λεγω-MPz", "ερρεθην", "I was said λεγω-Pa");
    addWord(words, null, 1768, "εἰς accusative", "into");
    addWord(words, nounDecoder, 1365, "ὁς", "who, which-mNs", "ὁν", "who, which-mAs",
        "ὁυ", "who, which-mnGs", "ᾡ", "who, which-mnDs", "ἥ", "who, which-fNs",
        "ἡν", "who, which-fAs", "ἡς", "who, which-fGs", "ᾑ", "who, which-fDs",
        "ὅ", "who, which-nNAs", "ὅι", "who, which-mNp", "ὁυς", "who, which-mAp",
        "ὡν", "who, which-mfnGp", "ὁις", "who, which-mnDp", "ἅι", "who, which-fNp",
        "ἁς", "who, which-fAp", "ἁις", "who, which-fDp", "ἁ", "who, which-nNAp");
    addWord(words, nounDecoder, 1391, "οὗτος", "this-m", "αὕτη", "this-f", "τοῦτο", "this-n");
    addWord(words, nounDecoder, 1318, "Θεός", "God-mN", "Θεοῦ", "God-mG");
    addWord(words, null, 1297, "ὅτι", "that, because");
    addWord(words, nounDecoder, 1283, "πᾶς", "all every each-m", "πᾶσα", "all every each-f",
        "πᾶν", "all every each-n");
    addWord(words, null, 1042, "γάρ", "for, because");
    addWord(words, nounDecoder, 919, "Ἰησοῦς", "Jesus-mN", "Ἰησοῦ", "Jesus-mG");
    addWord(words, null, 916, "ἐκ genitive", "out of, from", "ἐξ genitive", "out of, from");
    addWord(words, null, 891, "ἐπί accusative", "onto", "ἐπί genitive", "over", "ἐπί dative", "at");
    addWord(words, nounDecoder, 719, "κύριος", "lord-mN", "κύριου", "lord-mG");
    addWord(words, verbDecoder, 708, "ἐχω",	"I have-Ar", "ἑξω",	"I will have ἐχω-Au",
        "ἐσχον", "I had ἐχω-Aa", "ἐσχηκα", "I have had ἐχω-Az");
    addWord(words, null, 699, "πρός accusative", "to, towards");
    addWord(words, verbDecoder, 669, "γινομαι",	"I become, I am-Ar",
        "γενησομαι", "I will become γινομαι-Au", "εγενομην", "I became γινομαι-Aa",
        "γεγονα", "I have become γινομαι-Az", "γεγενημαι", "it has become γινομαι-MPz",
        "εγενηθην", "it became γινομαι-Pa");
    addWord(words, null, 668, "διά accusative", "on account of", "διά genitive", "through");
    addWord(words, null, 663, "ἵνα", "in order that");
    addWord(words, null, 646, "ἀπό genitive", "from");
    addWord(words, null, 638, "ἀλλά", "but (strong)");
    addWord(words, verbDecoder, 634, "ἐρχομαι", "I come, I go-Ar",
        "ελευσομαι", "I will come/go 'ερχομαι-Au", "ηλθον", "I came/went, 'ερχομαι-Aa",
        "εληλθυα", "I have come/gone 'ερχομαι-Az");
    addWord(words, nounDecoder, 579, "τίς", "who? what?-mfNs", "τίνα", "who? what?-mfAs/nNAp",
        "τίνος", "who? what?-mfnGs", "τίνι", "who? what?-mfnDs", "τί", "who? what?-nNAs",
        "τίνες", "who? what?-mfNp", "τίνας", "who? what?-mfAp", "τίνων", "who? what?-mfnGp",
        "τίσι", "who? what?-mfnDp");
    addWord(words, verbDecoder, 572, "ποιω", "I do, I make ποιεω-Ar",
        "ποιησω", "I will make/do ποιεω-Au", "εποιησα", "I did/made ποιεω-Aa",
        "πεποιηκα", "I have done/made ποιεω-Az", "πεποιημαι", "I have been done/made ποιεω-MPz");
    addWord(words, nounDecoder, 550, "ἄνθρωπος", "human being-mN", "ἄνθρωποῦ", "human being-mG");
    addWord(words, nounDecoder, 538, "τις", "someone something-mfNs", "τινα",
        "someone something-mfAs/nNAp", "τινος", "someone something-mfnGs",
        "τινι", "someone something-mfnDs", "τι", "someone something-nNAs",
        "τινες", "someone something-mfNp", "τινας", "someone something-mfAp", "τινων",
        "someone something-mfnGp", "τισι", "someone something-mfnDp");
    addWord(words, nounDecoder, 531, "Χριστός", "Christ-mN", "Χριστοῦ", "Christ-mG");
    addWord(words, null, 504, "ὡς", "as");
    addWord(words, null, 502, "εἰ", "if");
    addWord(words, null, 499, "οὖν", "therefore");
    addWord(words, null, 476, "κατά accusative", "according to", "κατά genitive", "down from");
    addWord(words, null, 473, "μετά accusative", "after", "μετά genitive", "with");
    addWord(words, verbDecoder, 455, "ὁρω",	"I see ὁραω-Ar", "ὀψομαι",	"I will see ὁραω-Au",
        "ειδον",	"I saw ὁραω-Aa", "ἑωρακα",	"I have seen ὁραω-Az", "ωφθην",	"I was seen ὁραω-Pa");
    addWord(words, verbDecoder, 428, "ακουω", "I hear-Ar", "ακουσω", "I will hear, ακουω-Au",
        "ηκουσα", "I heard, ακουω-Aa", "ακηκοα", "I have heard, ακουω-Az",
        "ηκουσθην", "I was heard, ακουω-Pa");
    addWord(words, nounDecoder, 418, "πολύς", "many, much-m", "πολλή", "many, much-f",
        "πολύ", "many, much-n");
    addWord(words, verbDecoder, 417, "διδωμι", "I give-Ar", "δωσω", "I will give, διδωμι-Au",
        "εδωκα", "I gave, διδωμι-Aa", "δεδωκα", "I have given, διδωμι-Az",
        "δεδομαι", "I have been given, διδωμι-MPz", "εδοθην", "I was given, διδωμι passive-Pa");
    addWord(words, nounDecoder, 414, "πατήρ", "father-mN", "πατρός", "father-mG");
    addWord(words, nounDecoder, 389, "ἡμέρα", "day-fN", "ἡμέρας", "day-fG");
    addWord(words, nounDecoder, 379, "πνεῦμα", "spirit, wind, breath-nN",
        "πνεύματος", "spirit, wind, breath-nG");
    addWord(words, nounDecoder, 377, "υἱός", "son-mN", "υἱοῦ", "son-mG");
    addWord(words, nounDecoder, 353, "εἷς", "one-m", "μία", "one-f", "ἕν", "one-n");
    addWord(words, nounDecoder, 343, "ἀδελφός", "brother-mN", "ἀδελφοῦ", "brother-mG");
    addWord(words, null, 343, "ἤ", "or");
    addWord(words, null, 333, "ἐάν", "if");
    addWord(words, null, 333, "περί accusative", "around", "περί genitive", "concerning, about");
    addWord(words, nounDecoder, 330, "λόγος", "word-mN", "λόγου", "word-mG");
    addWord(words, verbDecoder, 324, "οἶδα", "I know-Ar");
    addWord(words, null, 319, "ἑαυτοῦ", "himself, itself", "ἑαυτῆς", "herself");
    addWord(words, verbDecoder, 296, "λαλω", "I speak-Ar",
        "λαλησω", "I will speak, λαλεω-Au", "ελαλησα", "I spoke, λαλεω-Aa",
        "λελαληκα", "I have spoken, λαλεω-Az", "λελαλημαι", "I have been spoken, λαλεω-MPz",
        "ελαληθην", "I was spoken, λαλεω-Pa");
    addWord(words, nounDecoder, 273, "οὐρανός", "heaven-mN", "οὐρανοῦ", "heaven-mG");
    addWord(words, nounDecoder, 261, "μαθητής", "student, disciple-mN",
        "μαθητοῦ", "student, disciple-mG");
    addWord(words, verbDecoder, 258, "λαμβανω", "I take, I receive-Ar",
        "λημψομαι", "I will take, λαμβανω-Au", "ελαβον", "I took, λαμβανω-Aa",
        "ειληφα", "I have taken, λαμβανω-Az");
    addWord(words, nounDecoder, 250, "γῆ", "land, earth-fs", "γῆς", "land, earth-fG");
    addWord(words, verbDecoder, 249, "πιστεύω", "I believe-Ar",
        "πιστεύσω", "I will believe, πιστευω-Au", "ἐπίστευσα", "I believed, πιστευω-Aa",
        "πεπίστευκα", "I have believed, πιστευω-Az",
        "πεπίστευμαι", "I have been believed, πιστευω-MPz",
        "ἐπιστεύθην", "I was believed, πιστευω-Pa");
    addWord(words, nounDecoder, 245, "μέγας", "large, great-m", "μεγάλη", "large, great-f",
        "μέγα", "large, great-n");
    addWord(words, nounDecoder, 243, "πίστις", "faith, trust-fs", "πίστεως", "faith, trust-fG");
    addWord(words, verbDecoder, 242, "γινώσκω", "I know-Ar", "γνώσομαι", "I will know γινωσκω-Au",
        "ἔγνων", "I knew γινωσκω-Aa", "ἔγνωσκα", "I have known γινωσκω-Az",
        "ἔγνωσμαι", "It has been known γινωσκω-MPz", "ἐγνώσθην", "it was known γινωσκω-Pa");
    addWord(words, nounDecoder, 234, "ὄνομα", "name-ns", "ὄνοματος", "name-nG");
    addWord(words, nounDecoder, 233, "ἅγιος", "holy-m", "ἅγια", "holy-f", "ἅγιον", "holy-n");
    addWord(words, verbDecoder, 231, "ἀποκρίνομαι", "I answer-Ar",
        "ἀπεκρινἀμην", "I answered αποκρινομαι-Aa", "ἀπεκρίθην", "I was answered αποκρινομαι-Pa");
    addWord(words, null, 220, "ὑπό accusaive", "under", "ὑπό genitive", "by");
    addWord(words, verbDecoder, 218, "ἐξέρχομαι", "I go out-Ar",
        "ἐξελεὐσομαι", "I will go out εξερχομαι-Au", "ἐξῆλθον", "I went out εξερχομαι-Aa",
        "ἐξελήλυθα", "I have gone out εξερχομαι-Az");
    addWord(words, nounDecoder, 216, "ἀνήρ", "man-ms", "ἀνδρός", "man-mG");
    addWord(words, nounDecoder, 215, "γυνή", "woman-fs", "γυναικός", "woman-fG");
    addWord(words, null, 215, "τέ", "and, so");
    addWord(words, verbDecoder, 210, "δύναμαι", "I am able-Ar",
        "δυνήσομαι", "I will be able, δυναμαι-au", "ἠδυνήθην",	"δυναμαι-Pa");
    addWord(words, verbDecoder, 208, "θέλω", "I want-Ar", "ἠθέλησα", "I wanted θελω-Aa");
    addWord(words, null, 208, "ὅυτω", "thus", "ὅυτως", "thus");
    addWord(words, nounDecoder, 195, " Ἰουδαῖος", "jewish-m", " Ἰουδαῖα", "jewish-f", " Ἰουδαῖον",
        "jewish-n");
    addWord(words, null, 194, "παρά accusative", "alongside of", "παρά genitive", "from",
        "παρά dative", "in the presence of");
    addWord(words, verbDecoder, 194, "εισερχομαι", "I enter-Ar", "εἰσελεύσομαι",
        "I will enter εισερχομαι-Au", "εἰσῆλθον", "I entered εισερχομαι-Aa", "εἰσελήλυθα",
        "I have entered εισερχομαι-Az");
    addWord(words, verbDecoder, 191, "γραφω", "I write-Ar", "γράψω", "I will write γραφω-Au",
        "ἔγραψα", "I wrote γραφω-Aa", "γέγραφα", "I have written γράφω-Az", "γέγραμμαι",
        "I have been written γράφω-M/Pz", "ἐγράφην", "I was written γράφω-Pa");
    addWord(words, nounDecoder, 186, "κόσμος", "world-m", "κόσμου", "world-mG");
    addWord(words, null, 182, "καθώς", "just as");
    addWord(words, null, 179, "μέν", "indeed, on the one hand");
    addWord(words, nounDecoder, 177, "χείρ", "hand-f", "χειρός", "hand-fG");
    addWord(words, verbDecoder, 176, "ἑυρίσκω", "I find-Ar", "εὑρήσω", "I will find ἑυρίσκω-Au",
        "εὗρον", "I found ἑυρίσκω-Aa", "εὕρηκα", "I have found ἑυρίσκω-Az", "εὑρέθην",
        "I was found ἑυρίσκω-Pa");
    addWord(words, nounDecoder, 175, "ἄγγελος", "messenger, angel-m", "ἄγγελου",
        "messenger, angel-mG");
    addWord(words, nounDecoder, 175, "ὄχλος", "crowd-m", "ὄχλου", "crowd-mG");
    addWord(words, nounDecoder, 173, "ἁμαρτία", "sin-f", "ἁμαρτίας", "sin-fG");
    addWord(words, null, 166, "ἄν", "if, would, might");
    addWord(words, nounDecoder, 169, "ἔργον", "work-n", "ἔργου", "work-nG");
    addWord(words, nounDecoder, 166, "δόξα", "glory-f", "δόξης", "glory-fG");
    addWord(words, nounDecoder, 163, "πόλις", "city-f", "πόλεως", "city-fG");
    addWord(words, nounDecoder, 162, "βασιλεία", "kingdom-f", "βασιλείας", "kingdom-fG");
    addWord(words, nounDecoder, 162, "ἔθνος", "people-n", "ἔθνους", "people-nG");
    addWord(words, null, 160, "τοτε", "then");
    // Don't actually know the number for ostis.
    addWord(words, nounDecoder, 159, "ὅστις", "whoever, everyone-m", "ἥτις", "whoever, everyone-f",
        "ὅτι", "whoever, everyone-n");
    addWord(words, verbDecoder, 153, "πορευομαι", "I go-Ar", "πορεύσομαι", "I will go πορευομαι-Au",
        "πεπόρευμαι", "it has gone πορευομαι-M/Pz", "ἐπορεὐθην", "it went πορευομαι-Pa");
    addWord(words, null, 160, "ἕως", "until");
    addWord(words, nounDecoder, 159, "προτος", "first-m", "προτη", "first-f", "προτον", "first-n");
    addWord(words, nounDecoder, 157, "καρδια", "heart-f", "καρδιας", "heart-fG");
    addWord(words, verbDecoder, 157, "ἐσθιω", "I eat-Ar", "φάγομαι", "I will eat ἐσθιω-Au",
        "ἔφαγον", "I ate ἐσθιω-Aa");
    addWord(words, verbDecoder, 155, "ἱστημι", "Transitive: I set, put, place Intransitive: I stand, I " +
            "appear, I stop-Ar",  "στήσω", "I will stand, ἱστημι-Au", "ἔστησα", "I put, set ἱστημι-AaT",
        "ἔστην", "I stood ἱστημι-AaI", "ἔστηκα", "I have stood ἱστημι-Az", "ἐστάθην",
        "I was put ἱστημι-Pa");
    addWord(words, nounDecoder, 155, "ἀλλος", "other-m", "ἀλλη", "other-f", "ἀλλο", "other-n");
    addWord(words, nounDecoder, 155, "χαρις", "grace-f", "χαριτος", "grace-fG");
    addWord(words, verbDecoder, 152, "φημι", "I say-Ar");
    addWord(words, null, 150, "ὑπερ accusative", "above", "ὑπερ genitive", "in behalf of");
    addWord(words, verbDecoder, 148, "καλεω", "I call-Ar", "καλἐσω", "I will call καλεω-Au",
        "ἐκάλεσα", "I called καλεω-Aa", "κέκληκα", "I have called καλεω-Az",
        "κέκλημαι", "I have been called καλεω-M/Pz", "ἐκλήθην", "I was called καλεω-Pa");
    addWord(words, nounDecoder, 147, "σαρξ", "flesh-f", "σαρκος", "flesh-fG");
    addWord(words, verbDecoder, 147, "ἀγαπαω", "I love-Ar", "ἀγαπήσω", "I will love ἀγαπαω-Au",
        "ἠγάπησα", "I loved ἀγαπαω-Aa", "ἠγάπηκα", "I have loved ἀγαπαω-Az",
        "ἠγάπημαι", "I have been loved ἀγαπαω-M/Pz", "ἠγαπἠθην", "I was loved ἀγαπαω-Pa");
    addWord(words, null, 147, "νυν", "now");
    addWord(words, nounDecoder, 144, "προφητης", "prophet-m", "προφητου", "prophet-mG");
    addWord(words, verbDecoder, 144, "ἐγειρω", "I raise-Ar", "ἐγερῶ", "I will raise ἐγειρω-Au",
        "ἤγειρα", "I raised ἐγειρω-Aa", "ἐγήγερμαι", "I have been raised ἐγειρω-M/Pz",
        "ἠγέρθην", "I was raised ἐγειρω-Pa");
    addWord(words, null, 143, "ὀυδε", "and not, neither");
    addWord(words, verbDecoder, 143, "ἀφιημι", "I let go, divorce, forgive-Ar",
        "ἀφήσω", "I will forgive ἀφιημι-Au", "ἀφῆκα", "I forgave ἀφιημι-Aa",
        "ἀφέωμαι", "I have been forgiven ἀφιημι-M/Pz", "ἀφέθην", "I was forgiven ἀφιημι-Pa");
    addWord(words, nounDecoder, 142, "λαος", "people-m", "λαου", "people-mG");
    addWord(words, nounDecoder, 142, "σωμα", "body-n", "σωματος", "body-nG");
    addWord(words, null, 141, "παλιν", "again");
    addWord(words, verbDecoder, 140, "ζαω", "I live-Ar");
    return new WordSet(words);
  }

  static class GreekNounAbbreviationDecoder implements AbbreviationDecoder {
    public String decode(String answer) {
      StringBuilder builder = new StringBuilder();
      String[] parts = answer.split("-");
      if (parts.length == 1) return answer;
      builder.append(parts[0]).append(" - ");
      for (int i = 0; i < parts[1].length(); i++) {
        switch (parts[1].charAt(i)) {
        case 'A': builder.append("accusative "); break;
        case 'D': builder.append("dative "); break;
        case 'e': builder.append("emphatic "); break;
        case 'f': builder.append("feminine "); break;
        case 'G': builder.append("genitive "); break;
        case 'm': builder.append("masculine "); break;
        case 'n': builder.append("neuter "); break;
        case 'N': builder.append("nominative "); break;
        case 'p': builder.append("plural "); break;
        case 's': builder.append("singular "); break;
        case '/': builder.append("/ "); break;
        default: throw new RuntimeException("Bad letter dude! " + parts[1].charAt(i) + " in " + answer);
        }
      }
      return builder.toString();
    }
  }

  static class GreekVerbAbbreviationDecoder implements AbbreviationDecoder {
    public String decode(String answer) {
      StringBuilder builder = new StringBuilder();
      String[] parts = answer.split("-");
      if (parts.length == 1) return answer;
      builder.append(parts[0]).append(" - ");
      for (int i = 0; i < parts[1].length(); i++) {
        switch (parts[1].charAt(i)) {
        case 'A': builder.append("active "); break;
        case 'a': builder.append("aorist "); break;
        case 'u': builder.append("future "); break;
        case 'm': builder.append("imperative "); break;
        case 'i': builder.append("indicative "); break;
        case 'I': builder.append("intransitive "); break;
        case 'f': builder.append("infinitive "); break;
        case 'e': builder.append("imperfect "); break;
        case 'M': builder.append("middle "); break;
        case 'o': builder.append("optative "); break;
        case 'p': builder.append("participle "); break;
        case 'P': builder.append("passive "); break;
        case 'z': builder.append("perfect "); break;
        case 'c': builder.append("pluperfect "); break;
        case 'l': builder.append("plural "); break;
        case 'r': builder.append("present "); break;
        case 'n': builder.append("singular "); break;
        case 's': builder.append("subjunctive "); break;
        case 't': builder.append("second aorist "); break;
        case 'T': builder.append("transitive "); break;
        case '1': builder.append("first person "); break;
        case '2': builder.append("second person "); break;
        case '3': builder.append("third person "); break;
        case '/': builder.append("/ "); break;
        default: throw new RuntimeException("Bad letter dude!");
        }
      }
      if (parts.length > 2) {
        builder.append(new GreekNounAbbreviationDecoder().decode(" -" + parts[2]));
      }
      return builder.toString();
    }
  }


}
