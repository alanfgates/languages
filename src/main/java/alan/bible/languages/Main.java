package alan.bible.languages;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

      Options options = new Options();

      options.addOption(OptionBuilder
          .withLongOpt("grammar")
          .withDescription("Number of grammar rules to test")
          .hasArg()
          .create('g'));

      options.addOption(OptionBuilder
          .withLongOpt("help")
          .withDescription("print help message")
          .create('h'));

      options.addOption(OptionBuilder
          .withLongOpt("language")
          .withDescription("Language to test")
          .hasArgs()
          .create('l'));

      options.addOption(OptionBuilder
          .withLongOpt("number")
          .withDescription("Number of vocabulary words to test")
          .hasArg()
          .create('n'));

      options.addOption(OptionBuilder
          .withLongOpt("nouns")
          .withDescription("Number of nouns to test")
          .hasArg()
          .create('o'));

       options.addOption(OptionBuilder
          .withLongOpt("verbs")
          .withDescription("Number of verbs to test")
          .hasArg()
          .create('v'));

      options.addOption(OptionBuilder
          .withLongOpt("dump-to-spreadsheet")
          .withDescription("Dump all words to a set of files to be imported by a spreadsheet, " +
              "argument is a directory to put the files in")
          .hasArg()
          .create('s'));

      options.addOption(OptionBuilder
          .withLongOpt("dump-size")
          .withDescription("Number of words to dump to each file when dumping for a spreadsheet")
          .hasArg()
          .create('z'));

      try {
        CommandLine cli = new GnuParser().parse(options, args);

        if (cli.hasOption('h')) {
          HelpFormatter formatter = new HelpFormatter();
          formatter.printHelp("langtest", options);
          return;
        }

        int toTest = 0;
        if (cli.hasOption('n')) {
          toTest = Integer.valueOf(cli.getOptionValue('n'));
        }
        int verbs = 0;
        if (cli.hasOption('v')) {
          verbs = Integer.valueOf(cli.getOptionValue('v'));
        }
        int grammarRules = 0;
        if (cli.hasOption('g')) {
          grammarRules = Integer.valueOf(cli.getOptionValue('g'));
        }
        int nouns = 0;
        if (cli.hasOption('o')) {
          nouns = Integer.valueOf(cli.getOptionValue('o'));
        }

        if (!cli.hasOption('l')) {
          usage(options);
          return;
        }

        String[] languageNames = cli.getOptionValues('l');
        Language[] languages = new Language[languageNames.length];
        for (int i = 0; i < languageNames.length; i++) {
          languages[i] = Engine.findLanguage(languageNames[i]);
        }

        if (cli.hasOption('s')) {
          SpreadsheetDumper dumper = new SpreadsheetDumper();
          dumper.dump(cli.getOptionValue('s'), Integer.valueOf(cli.getOptionValue('z', "50")),
              languages);
        } else {
          Engine eng = new Engine(new Random(), grammarRules, nouns, verbs, toTest);
          eng.run(languages);
        }

      } catch (Exception e) {
        System.err.println("Fail!");
        System.err.println(e.getMessage());
        e.printStackTrace();
      }
    }

    private static void usage(Options options) {
      HelpFormatter formatter = new HelpFormatter();
      formatter.printHelp("langtest", options);
    }
}
