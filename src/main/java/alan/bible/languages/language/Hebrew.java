package alan.bible.languages.language;

import alan.bible.languages.Language;
import alan.bible.languages.Word;
import alan.bible.languages.WordSet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gates on 5/30/15.
 */
public class Hebrew extends Language {
  @Override
  public String getName() {
    return "Hebrew";
  }

  @Override
  public WordSet getInitialGrammarRules() {
    List<Word> words = new ArrayList<>();
    addWord(words, null, 1, "ָ ", "Qames a in yacht or o in row", "ַ ", "Pathach a in yacht",
      "ִ ", "Hireq ee in bee", "ֵ ", "Seri ay in hay", "ֶ ", "Segol e in bed",
      "וּ", "Sureq oo in zoo", "ֻ ", "Qibbus oo in zoo", "ֹ ", "Holem o in low",
      "וֹ", "Holem o in low", "ֲ ", "Hateph-Pathach", "ֱ ", "Hateph-Segol", "ֳ ", "Hateph-Qames",
      "ְ ", "Shiva, uh or no sound", "ּ ", "Dagesh");
    return new WordSet(words);
  }

  @Override
  public WordSet getInitialVerbs() {
    List<Word> words = new ArrayList<>();
    AbbreviationDecoder verbDecoder = new HebrewVerbAbbreviationDecoder();
    addWord(words, verbDecoder, 20160, "שָׁמַרְתִּי", "I guarded-Gp1s", "שָׁמַרְתָּ",
        "you guarded-Gp2ms", "שָׁמַרְתּ", "you guarded-Gp2fs", "שָׁמַר", "he guarded-Gp3ms",
        "שָׁמַרָה", "she guarded-Gp3fs", "שָׁמַרְנוּ", "we guarded-Gp1l",
        "שָׁמַרְתֶּם", "you guarded-Gp2ml", "שָׁמַרְתֶּן", "you guarded-Gp2fl",
        "שָׁמַרוּ", "they guarded-Gp3l");
    addWord(words, verbDecoder, 20160, "אֶשְׁמֹר", "I will guard-Gi1s",
        "תִּשְׁמֹר", "you/she will guard-Gi2m/3fs", "תִּשְׁמְרִי", "you will guard-Gi2fs",
        "יִשְׁמֹר", "he will guard-Gi3ms", "נִשְׁמֹר", "We will guard-Gi1l",
        "תִּשְׁמְרוּ", "you will guard-Gi2ml", "תִּשְׁמֹרְנָה", "you/they will guard-Gi23fl",
        "יִשְׁמְרוּ", "they will guard-Gi3ml");
    addWord(words, verbDecoder, 5040, "שׁוֹמֵר", "guarding-Gams", "שׁוֹמֶרֶת", "guarding-Gafs",
        "שׁוֹמְרִים", "guarding-Gaml", "שׁוֹמְרִוֹת", "guarding-Gafl");
    addWord(words, verbDecoder, 5040, "אֶשְׁמְרָה", "I must guard-Gcs",
        "נִשְׁמְרָה", "We must guard-Gcl",
        "שְׁמֹר", "guard!/to guard-Gems/nC", "שִׁמְרִי", "guard!-Gefs", "שִׁמְרוּ", "guard!-Geml",
        "שְׁמֹרְנָה", "guard!-Gefl", "שָׁמֹר", "to guard-GnA");
    addWord(words, verbDecoder, 3797, "הִשׁמַרְתִּי", "I caused to guard-Hp1s",
        "הִשְׁמַרְתָּ", "you caused to guard-Hp2ms", "הִשְׁמַרְתּ", "you caused to guard-Hp2fs",
        "הִשְׁמִיר", "he caused to guard-Hp3ms", "הִשְׁמִירָה", "she caused to guard-Hp3fs",
        "הִשְׁמַרְנוּ", "we caused to guard-Hp1l", "הִשְׁמַרְתֶּם", "you caused to guard-Hp2ml",
        "הִשְׁמַרְתֶּן", "you caused to guard-Hp2fl", "הִשְׁמִירוּ", "they caused to guard-Hp3l");
    addWord(words, verbDecoder, 3797, "אַשְׁמִיר", "I will cause to guard-Hi1s",
        "תַּשְׁמִיר", "you/she will cause to guard-Hi2m/3fs",
        "תַּשְׁמִירִי", "you will cause to guard-Hi2fs", "יַשְׁמִיר", "he will cause to guard-Hi3ms",
        "נַשְׁמִיר", "we will cause to guard-Hi1l", "תַּשְׁמִירוּ", "you will cause to guard-Hi2ml",
        "תַּשְׁמֵירְנָה", "you/they will cause to guard-Hi23fl", "יִשְׁמִירוּ", "they will cause to guard-Hi3ml");
    addWord(words, verbDecoder, 949, "הַשְׁמֵר", "cause to guard!/to cause to guard-Hems/nA",
        "הַשִׁמִירי", "cause to guard!-Hefs", "הַשִׁמִירו", "cause to guard!-Heml",
        "הַשְׁמֵרְנָה", "cause to guard!-Hefl", "יַשְׁמֵר", "cause to guard!-Hjms",
        "הַשְׁמִיר", "to cause to guard-nC");
    addWord(words, verbDecoder, 949, "מַשְׁמִיר", "causing to guard-Hams",
        "מַשְׁמֶרֶת", "causing to guard-Hafs", "מַשְׁמִירִים", "causing to guard-Haml",
        "מַשְׁמִירִוֹת", "causing to guard-Hafl");
    addWord(words, verbDecoder, 2589, "שִׁמַּרְתִּי", "I intensely guarded-Dp1s",
        "שִׁמַּרְתָּ", "you intensely guarded-Dp2ms", "שִׁמַּרְתְּ", "you intensely guarded-Dp2fs",
        "שִׁמֵּר", "he intensely guarded-Dp3ms", "שִׁמְּרָה", "she intensely guarded-Dp3fs",
        "שִׁמַּרְנוּ", "we intensely guarded-Dp1l", "שִׁמַּרְתֶּם", "you intensely guarded-Dp2ml",
        "שִׁמַּרְתֶּן", "you intensely guarded-Dp2fl", "שִׁמְּרוּ", "they intensely guarded-Dp3l");
    addWord(words, verbDecoder, 2589, "אֲשַׁמֵּר", "I will intensely guard-Di1s",
        "תְּשַׁמֵּר", "you/she will intensely guard-Di2m/3fs",
        "תְּשַׁמְּרִי", "you will intensely guard-Di2fs",
        "יִשַׁמֵּר", "he will intensely guard-Dij3ms",
        "נְשַׁמֵּר", "we will intensely guard-Di1l",
        "תְּשַׁמְּרוּ", "you will intensely guard-Di2ml",
        "תְּשַׁמֵּרְנָה", "you/they will intensely guard-Di23fl",
        "יִשַׁמֵּרוּ", "they will intensely guard-Di3ml");
    addWord(words, verbDecoder, 647, "שַׁמֵּר", "intensely guard!/to intensely guard-Dems/nC",
        "שַׁמְּרִי", "intensely guard!-Defs", "שַׁמְּרו", "intensely guard!-Deml",
        "שַׁמֵּרְנָה", "intensely guard!-Defl", "שַׁמּר", "intensely guard!-DnA");
    addWord(words, verbDecoder, 647,  "מְשַׁמֵּר", "intensely guarding-Dams",
        "מְשַׁמֶּרֶת", "intensely guarding-Dafs", "מְשַׁמְּרִים", "intensely guarding-Daml",
        "מְשַׁמְּרוֹת", "intensely guarding-Dafl");
    addWord(words, verbDecoder, 4163, "נִשְׁמַרְתִּי", "I was guarded-Np1s",
        "נִשׁמַרְתָּ", "you were guarded-Np2ms", "נִשׁמַרְתְּ", "you were guarded-Np2fs",
        "נִשׁמַר", "he was guarded-Np3ms", "נִשְׁמְרָה", "she was guarded-Np3fs",
        "נִשְׁמַרְנוּ", "we were guarded-Np1l", "נִשְׁמַרְתֶּם", "you were guarded-Np2ml",
        "נִשְׁמַרְתֶּן", "you were guarded-Np2fl", "נִשְׁמְרוּ", "they were guarded-Np3l");
    addWord(words, verbDecoder, 4141, "אֶשָּׁמֵר", "I will be guarded-Ni1s",
        "תִּשָּׁמֵר", "you/she will be guarded-Ni2m/3fs",
        "תִּשָּׁמְרִי", "you will be guarded-Ni2fs",
        "יִשָּׁמֵר", "he will be guarded-Nij3ms",
        "נִשָּׁמֵר", "we will be guarded-Ni1l",
        "תִּשָּׁמְרוּ", "you will be guarded-Ni2ml",
        "תִּשָּׁמַרְנָה", "you/they will be guarded-Ni23fl",
        "יִשָּׁמְרוּ", "they will be guarded-Ni3ml");
    addWord(words, verbDecoder, 6, "הִשָּׁמֵר", "be guarded!/to be guarded-Nems/nC",
        "הִשָּׁמְרִי", "be guarded!-Nefs", "הִשָּׁמְרוּ", "be guarded!-Neml",
        "הִשָּׁמַרְנָה", "be guarded!-Nefl", "נִשְׁמֹר", "be guarded!-NnA");
    addWord(words, verbDecoder, 6,  "נִשְׁמָר", "being guarded-Nams",
        "נִשְׁמֶרֶת", "being guarded-Nafs", "נִשְׁמָרִים", "being guarded-Naml",
        "נִשְׁמָרוֹת", "being guarded-Nafl");
        /*
| Pual      |   422 |   0.6 |   409 |   0.6 |
| Hithpael  |   842 |   1.2 |   835 |   1.2 |
| Hophal    |   396
         */
    return new WordSet(words);
  }

  @Override
  public WordSet getInitialNouns() {
    return null;
  }

  @Override
  public WordSet getInitialVocabulary() {
    List<Word> words = new ArrayList<>();

    AbbreviationDecoder nounDecoder = new HebrewNounAbbreviationDecoder();

    addWord(words, null, 50524, "וְ", "and");
    addWord(words, null, 23968, "הַ", "the");
    addWord(words, null, 20435, "לְ", "to");
    addWord(words, null, 15632, "בְּ", "in, at, with");
    addWord(words, null, 10970, "אֶת", "direct object marker");
    addWord(words, null, 7586, "מִן", "from");
    addWord(words, null, 5778, "עַל", "upon, over, above");
    addWord(words, null, 5518, "אֶל", "to, toward");
    addWord(words, null, 5503, "אֲשֶׁר", "which");
    addWord(words, null, 5518, "לֹא", "not, permanent");
    addWord(words, null, 5415, "כֹּל", "all",  "כָּל", "all");
    addWord(words, null, 5317, "אָמַר", "he said");
    addWord(words, nounDecoder, 4942, "בֵּן", "son-ms", "בָּנִים", "son-mp");
    addWord(words, null, 4487, "כִּי", "that, because, when");
    addWord(words, null, 3576, "הָיָה",	"he was");
    addWord(words, null, 2909, "כְּ", "as, like");
    addWord(words, null, 2632, "עָשַה",	 "he did, he made");
    addWord(words, nounDecoder, 2602, "אֱלֹהִים", "God/gods-ms/mp");
    addWord(words, null, 2579, "בָא", "he came");
    addWord(words, nounDecoder, 2530, "מֶלֶך", "king-ms", "מְלָכִים", "king-mp");
    addWord(words, nounDecoder, 2529, "זֶה",	"this-m", "זֹאת", "this-f", "אֵלָה", "these");
    addWord(words, nounDecoder, 2505, "אֶרֶץ", "land, earth-fs", "אֲרָצוֹת", "land-fp");
    addWord(words, nounDecoder, 2452, "הוּא", "he", "הִיא", "she", "הֵם", "they-m", "הֵנָּה", "they-f");
    addWord(words, nounDecoder, 2303, "יוֹם", "day-ms", "יָמִים", "day-fp");
    addWord(words, nounDecoder, 2187, "אִיש", "man-ms", "אֲנָשִׁים", "man-mp");
    addWord(words, nounDecoder, 2128, "פָּנִים", "face-msp",
        "פְּנֵי", "with preposition, before, in the presence of");
    addWord(words, nounDecoder, 2046, "בַּיִת", "house-ms", "בָּתִּים", "house-mp");
    addWord(words, null, 2014, "נָתַן", "he gave, put, set");
    addWord(words, nounDecoder, 1867, "עַם", "people, nation-ms", "עַמִּים", "people, nation-mp");
    addWord(words, nounDecoder, 1627, "יָד", "hand-fs", "יָדַיִם", "hand-fp");
    addWord(words, null, 1554, "הָלַךּ",	"he walked");
    addWord(words, nounDecoder, 1494, "דָּבָר", "word, speech-ms", "דְּבָרִים", "word, speech-mp");
    addWord(words, null, 1310, "רָאָה", "he saw");
    addWord(words, null, 1263, "עַד", "until, as far as");
    addWord(words, null, 1239, "אֲנִי", "I, myself", "אָנֹכִי", "I, myself", "אֲנַחְנוּ", "we",
        "נַחְנו", "we");
    addWord(words, nounDecoder, 1210, "אָב", "father-ms", "אָבוֹת", "father-mp");
    addWord(words, null, 1165, "שָׁמַע",	 "he heard");
    addWord(words, null, 1135, "דִּבֶּר",	"he spoke");
    addWord(words, nounDecoder, 1104, "אַתָּה", "you-ms", "אַתְּ", "you-fs", "אַתֶּם", "you-mp",
        "אַתֶּן", "you-fp");
    addWord(words, nounDecoder, 1094, "עִיר", "city-fs", "עָרִים", "city-fp");
    addWord(words, null, 1087, "יָשַׁב",	"he sat, he dwelt");
    addWord(words, null, 1075, "יָצָא", 	"he went out");
    addWord(words, null, 1075, "שָׁב", "he returned");
    addWord(words, null, 1070, "אִם", "if");
    addWord(words, null, 1061, "הִנַּה", "behold");
    addWord(words, null, 1048, "עִם", "with");
    addWord(words, nounDecoder, 976, "אֶחָד", "one-m", "אַחַת", "one-f");
    addWord(words, null, 966, "לָקַח", "he took");
    addWord(words, null, 952, "יָדַע", "he knew");
    addWord(words, nounDecoder, 896, "עַיִן", "eye, spring-fs", "עֵינַים", "eye, spring-fp");
    addWord(words, null, 898, "אֵת", "with");
    addWord(words, null, 894, "עָלָה", "he went up");
    addWord(words, nounDecoder, 879, "שָׁנָה", "year-fs", "שׁנִים", "year-fp");
    addWord(words, nounDecoder, 864, "שֵׁם", "name-ms", "שֵׁמוֹת", "name-mp");
    addWord(words, null, 847, "שָׁלַח", "he sent");
    addWord(words, null, 845, "מֵת", "he died");
    addWord(words, null, 835, "שָׁם", "there");
    addWord(words, null, 814, "אָכַל", "he ate");
    addWord(words, nounDecoder, 803, "עֶבֶד", "servant, slave-ms", "עֲבָדִים", "servant, slave-mp");
    addWord(words, null, 783, "אַיִן", "nothing, there is not");
    addWord(words, nounDecoder, 781, "אִשּׁה", "woman, wife-fs", "אשּׁת", "woman, wife-fp",
        "נָשׁים", "woman, wife-fp");
    addWord(words, nounDecoder, 774, "אָדוֹן", "lord, master-ms", "אֲדֹנִים", "lord, master-mp");
    addWord(words, nounDecoder, 769, "שְׁנַיִם", "two-m", "שְׁתַּים", "two-f");
    addWord(words, null, 769, "גַּם", "also");
    addWord(words, nounDecoder, 757, "נֶפֶש", "soul, person-fs", "נְפָשׁוֹת", "soul, person-fp");
    addWord(words, null, 754, "מָה", "what?");
    addWord(words, nounDecoder, 750, "כֹּהַן", "priest-ms", "כֹהֲנִים", "priest-mp");
    addWord(words, null, 748, "הֲ", "indicates interrogative");
    addWord(words, null, 743, "כֵּן", "so, thus");
    addWord(words, null, 736, "קָרָא", "he called");
    addWord(words, null, 729, "אַל",	"no, not temporary");
    addWord(words, nounDecoder, 712, "דֶּרֶךּ", "way,road-mfs", "דֶּרָכִים", "way, road-mfp");
    addWord(words, null, 707, "אַחַר", "after");
    addWord(words, null, 658, "נָשָׂא", "he lifted, carried, took");
    addWord(words, nounDecoder, 629, "אָח", "brother-ms", "אַחִים", "brother-mp");
    addWord(words, null, 627, "קָם", "he arose, stood");
    addWord(words, nounDecoder, 606, "שָׁלשׁ", "three-f", "שׁלֹשָׁה", "three-m");
    addWord(words, nounDecoder, 601, "לֵב", "heart-ms", "לֵבָב", "heart-mp");
    addWord(words, nounDecoder, 600, "רֹאשׁ", "head-ms", "רָאשִׁים", "head-mp");
    addWord(words, nounDecoder, 588, "בַּת", "daughter-fs", "בָּנוֹת", "daughter-fp");
    addWord(words, nounDecoder, 583, "מָיִם", "water-msp");
    addWord(words, nounDecoder, 583, "מֵאָה", "hundred");
    addWord(words, null, 577, "כֹּה", "thus, here");
    addWord(words, nounDecoder, 560, "גּוֹי", "nation-ms", "גּוֹיִם", "nation-mp");
    addWord(words, nounDecoder, 559, "הַר", "mountain-ms", "הָרִים", "mountain-mp");
    addWord(words, null, 554, "עָבַר", "he passed over, passed through, passed by");
    addWord(words, nounDecoder, 545, "אָדָם", "man-ms");
    addWord(words, null, 528, "שָׂם", "he put, set");
    addWord(words, null, 526, "גָּדוֹל", "great");
    addWord(words, null, 524, "עָמַד", "he stood");
    addWord(words, null, 511, "תַּחַת", "under, instead of");
    addWord(words, nounDecoder, 508, "חָמַשׁ", "five-f", "חֲמִשָּׁה", "five-m");
    addWord(words, nounDecoder, 505, "קוֹל", "voice, sound-ms", "קֹלוֹת", "voice, sound-mp");
    addWord(words, null, 501, "הִכָּה", "he hit (hiphal)");
    addWord(words, nounDecoder, 498, "פֶה", "mouth-m", "פִּיּוֹת", "mouth-mp");
    addWord(words, nounDecoder, 496, "צָבָא", "host, army, war, service-m", "צְבָאוֹת",
        "host, army, war, service-mp");
    addWord(words, null, 496, "צִוָּה", "he commanded");
    addWord(words, null, 495, "יָלַד", "he bore, he begat");
    addWord(words, null, 494, "אֶלֶף", "thousand");
    addWord(words, nounDecoder, 492, "עֶשֶׁר", "ten-f", "עֲשָׂרָה", "ten-m");
    addWord(words, nounDecoder, 491, "שֶׁבַע", "seven-f", "שִׁבְעָה", "seven-m");
    addWord(words, null, 491, "עוֹד", "again, still, long");
    addWord(words, nounDecoder, 470, "קֹדֶש", "holy, apart, sacred-m", "קֳדָשִׁים", "holy-mp");
    addWord(words, null, 469, "שָׁמַר", "he guarded, watched, preserved");
    addWord(words, null, 457, "מָצַה", "he found");
    addWord(words, nounDecoder, 456, "אַרְבַּע", "four-f", "אַרְבָּעָה", "four-m");
    addWord(words, nounDecoder, 439, "עוֹלָם", "forever-m", "עוֹלָמִים", "forever-mp");
    addWord(words, null, 435, "נָפַל", "he fell");
    addWord(words, null, 435, "עַתָּה", "now");
    addWord(words, nounDecoder, 424, "מִשְׁפָת", "judgement, law-m", "מִשׁפָּטִים",
        "judgement, law-mp");
    addWord(words, null, 424, "מִי", "who?");
    addWord(words, nounDecoder, 421, "שַׂר", "prince, chief-m", "שָׂרִים", "prince, chief-mp");
    addWord(words, nounDecoder, 421, "שָׁמַיִם", "heavens-msp");
    addWord(words, null, 420, "תָּוֶךּ", "midst");
    addWord(words, nounDecoder, 413, "חֶרֶב", "sword-f", "חֲרָבוֹת", "sword-fp");
    addWord(words, nounDecoder, 409, "רַב", "great, many-m", "רַבָּה", "great, many-f");
    addWord(words, null, 409, "בַּין", "between");
    addWord(words, null, 405, "נָא", "please, now");
    addWord(words, nounDecoder, 403, "כֶּסֶף", "silver, money-m");
    addWord(words, nounDecoder, 403, "מִזְבֵּחַ", "alter-m", "מִזְבְּחוֹת", "alter-mp");
    addWord(words, nounDecoder, 401, "מָקוֹם", "place-m", "מְקוֹמוֹת", "place-mp");
    addWord(words, nounDecoder, 396, "יָם", "sea-m", "יַמִּים", "seas-mp");
    addWord(words, nounDecoder, 389, "זָהָב", "gold-m");
    addWord(words, null, 382, "יָרַד", "he went down");
    addWord(words, null, 377, "בָּנָה", "he built");
    addWord(words, nounDecoder, 377, "אַשׁ", "fire-f");
    addWord(words, nounDecoder, 376, "נְאֻם", "utterance-m");
    addWord(words, nounDecoder, 373, "שַׁעַר", "gate-m", "שְׁעָרִים", "gates-mp");
    addWord(words, nounDecoder, 373, "טוֹב", "good-ms", "טוֹבָה", "good-fs", "טוֹבִים", "good-mp",
        "טוֹבוֹת", "good-fp");
    addWord(words, null, 371, "הִגִיד - נגד", "he told, declared");
    addWord(words, nounDecoder, 363, "רוּחַ", "spirit, breath, wind-f", "רוּחוֹת",
        "spirit, breath, wind-fp");
    addWord(words, nounDecoder, 361, "דָּם", "blood-m", "דָּמִים", "blood-mp");
    addWord(words, nounDecoder, 357, "רַע", "bad, evil-ms", "רָעָה", "bad, evil-fs", "רָעִים",
        "bad, evil-mp", "רָעוֹת", "bad, evil-fp");
    addWord(words, null, 350, "מָלַךּ", "he reigned");
    addWord(words, nounDecoder, 348, "אֹהֶל", "tent-m", "אֹהָלִים", "tent-mp");
    addWord(words, null, 338, "סָבִיב", "all around");
    addWord(words, nounDecoder, 337, "עֲשָׂרה", "ten-m", "עָשָׂר", "ten-f");
    addWord(words, nounDecoder, 330, "עֵץ", "tree-m", "עֵצִים", "tree-mp");
    addWord(words, null, 327, "בֵּרֵךּ", "he blessed");
    addWord(words, nounDecoder, 325, "כְּלִי", "utensil, weapon-m", "כֵּלִים",
        "utensil, weapon-mp");
    addWord(words, nounDecoder, 321, "שָׂדֶה", "field-m", "שָׂדוֹת", "field-mp");
    addWord(words, null, 321, "אוֹ", "or");
    addWord(words, nounDecoder, 319, "מִלְחָמָה", "war, battle-f", "מִלְחָמוֹת", "war, battle-fp");
    addWord(words, null, 318, "יָרֵא", "he feared");
    addWord(words, null, 317, "עָנָה", "he answered");
    addWord(words, nounDecoder, 317, "נָבִיא", "prophet-m", "נְבִיאִים", "prophet-mp");
    addWord(words, nounDecoder, 311, "רָעָה", "evil, misery, distress-f");
    addWord(words, null, 304, "פָּקַד", "he numbered, appointed, punished, visited");
    addWord(words, nounDecoder, 304, "מִשְׁפָּחָה", "family-f", "מִשְׁפָּחוֹת", "family-fp");
    addWord(words, null, 298, "סָר - סור", "he turned aside");
    addWord(words, nounDecoder, 298, "חַטָּאת", "sin, sin offering-f");
    addWord(words, nounDecoder, 298, "לֶחֶם", "bread, food-m");
    addWord(words, null, 298, "מְאֹד", "very");
    addWord(words, nounDecoder, 296, "עַת", "time-f");
    addWord(words, null, 290, "חָזַק", "he was strong");
    addWord(words, null, 289, "כָּרַת", "he cut off");
    addWord(words, null, 289, "עָבַד", "he worked, he served");
    addWord(words, nounDecoder, 288, "עֹלָה", "burnt offering-f", "עֹלוֹת", "burnt offering-fp");
    addWord(words, null, 287, "חָיָה", "he lived");
    addWord(words, null, 284, "אָיַב", "he was hostile");
    addWord(words, nounDecoder, 284, "בְּרִית", "covenant-f");
    addWord(words, nounDecoder, 283, "חֹדֶשׁ", "month-m", "חֳדָשִׁים", "month-mp");
    addWord(words, null, 280, "קָרַב", "he came near, he offered");
    addWord(words, nounDecoder, 277, "אַף", "nose, anger-m", "אַפַּיִם", "nose, anger-mp");
    addWord(words, nounDecoder, 274, "צֹאן", "flock, sheep-fsp");
    addWord(words, nounDecoder, 274, "שִׁשָׁה", "six-m", "שַׁשׁ", "six-f");
    addWord(words, nounDecoder, 272, "אֶבֶן", "stone-f", "אֲבָנִים", "stone-fp");
    addWord(words, null, 272, "לְמַעַן", "because of, in order to, for the sake of");
    addWord(words, nounDecoder, 270, "בָּשָׂר", "flesh-m", "בְּשָׂרִים", "flesh-mp");
    addWord(words, nounDecoder, 270, "מִדְבָּר", "wilderness-m");
    addWord(words, nounDecoder, 268, "חַיִּים", "life-mP");
    addWord(words, nounDecoder, 264, "רָשָׁע", "wicked (adjective)");
    addWord(words, nounDecoder, 252, "לֵב", "heart, mind-m", "לַבָב", "heart, mind-mp");
    addWord(words, nounDecoder, 252, "מַטֶּה", "tribe, staff-m", "מָטּוֹת", "tribe, staff-mp");
    addWord(words, nounDecoder, 251, "רֶגֶל", "foot-f", "רַגְלַיִם", "foot-fp");
    addWord(words, null, 250, "מָלֵא", "he filled");
    addWord(words, nounDecoder, 250, "אַמָּה", "cubit-f", "אַמּוֹת", "cubits-fp");
    addWord(words, nounDecoder, 249, "חֶסֶד", "loving kindness, steadfast love-m", "חֲסָדִים",
        "loving kindnesses, steadfast loves-mp");
    addWord(words, nounDecoder, 245, "חַיַל", "strength, wealth, army-m", "חֲיָלִים",
        "armies,strengths, wealths-mp");
    addWord(words, nounDecoder, 241, "גְּבוּל", "border-m");
    addWord(words, nounDecoder, 240, "נַעַר", "boy, youth-m", "נְעָרִים", "boys, youths-mp");
    addWord(words, null, 239, "חָטָא", "he sinned, he missed");
    addWord(words, nounDecoder, 237, "שָׁלוֹם", "peace, completeness-m");
    addWord(words, nounDecoder, 236, "אֵל", "god-m");
    addWord(words, nounDecoder, 235, "םַעֲשֶׂה", "work, deed-m", "מַעֲשִׂים", "works, deeds-mp");
    addWord(words, nounDecoder, 233, "עָוֹן", "iniquity-m", "עֲוֹנוֹת", "iniquities-mp");
    addWord(words, null, 232, "יָרַשׁ", "he inherited, he possessed, he dispossessed");
    addWord(words, nounDecoder, 229, "זֶרַע", "seed-m");
    addWord(words, nounDecoder, 227, "לַיְלָה", "night-m", "לֵילוֹת", "nights-mp");
    addWord(words, nounDecoder, 227, "קֶרֶב", "midst, inward part-m");
    addWord(words, null, 225, "בִּקֵּשׁ", "he sought");
    addWord(words, null, 225, "זָכַר", "he remembered");
    addWord(words, null, 225, "כָּתַב", "he wrote");
    addWord(words, nounDecoder, 223, "מוֹעַד", "appointed time, place-m", "מוֹעֲדִים",
        "appointed times, places-mp");
    addWord(words, nounDecoder, 223, "תּוֹרָה", "law, instruction-f", "תּוֹרוֹת",
        "laws, instructions-fp");
    addWord(words, nounDecoder, 222, "נַחֲלָה", "possession-f", "נְחָלוֹת", "possessions-fp");
    addWord(words, nounDecoder, 222, "אֲדָמָה", "land, ground, earth-f", "אֲדָמוֹת",
        "lands, grounds-fp");
    addWord(words, nounDecoder, 220, "אֵם", "mother-f");
    addWord(words, null, 219, "נָכְוֹן", "he was firm, established, prepared");
    addWord(words, null, 217, "אָהַב", "he loved");
    addWord(words, null, 217, "שָׁתָה", "he drank");
    addWord(words, null, 216, "נָטָה", "he stretched out");
    addWord(words, nounDecoder, 216, "בֶּגֶד", "garmet-m", "בְּגָדִים", "garmets-mp");


    return new WordSet(words);
  }

  static class HebrewNounAbbreviationDecoder implements AbbreviationDecoder {
    public String decode(String answer) {
      StringBuilder builder = new StringBuilder();
      String[] parts = answer.split("-");
      if (parts.length == 1) return answer;
      builder.append(parts[0]).append(" - ");
      for (int i = 0; i < parts[1].length(); i++) {
        switch (parts[1].charAt(i)) {
        case 'a': builder.append("adjective "); break;
        case 'f': builder.append("feminine "); break;
        case 'm': builder.append("masculine "); break;
        case 'p': builder.append("plural "); break;
        case 'P': builder.append("plural only"); break;
        case 's': builder.append("singular "); break;
        case '/': builder.append("/ "); break;
        default: throw new RuntimeException("Bad letter dude!");
        }
      }
      return builder.toString();
    }
  }

  static class HebrewVerbAbbreviationDecoder implements AbbreviationDecoder {
    public String decode(String answer) {
      StringBuilder builder = new StringBuilder();
      String[] parts = answer.split("-");
      if (parts.length == 1) return answer;
      builder.append(parts[0]).append(" - ");
      for (int i = 0; i < parts[1].length(); i++) {
        switch (parts[1].charAt(i)) {
        case 'A': builder.append("absolute "); break;
        case 'C': builder.append("construct "); break;
        case 'c': builder.append("cohortative "); break;
        case 'f': builder.append("feminine "); break;
        case 'H': builder.append("hiphil "); break;
        case 'T': builder.append("hithpael "); break;
        case 'O': builder.append("hophal "); break;
        case 'e': builder.append("imperative "); break;
        case 'i': builder.append("imperfect "); break;
        case 'n': builder.append("infinitive "); break;
        case 'j': builder.append("jussive "); break;
        case 'm': builder.append("masculine "); break;
        case 'N': builder.append("niphal "); break;
        case 'a': builder.append("participle "); break;
        case 'p': builder.append("perfect "); break;
        case 'D': builder.append("piel "); break;
        case 'l': builder.append("plural "); break;
        case 'P': builder.append("pual "); break;
        case 'G': builder.append("qal "); break;
        case 's': builder.append("singular "); break;
        case '1': builder.append("first person "); break;
        case '2': builder.append("second person "); break;
        case '3': builder.append("third person "); break;
        case '/': builder.append("/ "); break;
        default: throw new RuntimeException("Bad letter dude!");
        }
      }
      return builder.toString();
    }
  }

}
