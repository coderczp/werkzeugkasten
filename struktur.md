# Introduction #

Ant is very easy but very slowly.

Maven2 has many features but very complexly and all features are not necessary.

some of any other tools has scary domain specific language.

XML attract needless problems and needless complexly.

struktur will supply all of necessary features but won't supply needless feature.

# Details #

struktur features :
  * Phase based building.
  * Builing script is java code.
  * Automaticaly download libraries from maven2 remote repositories.
  * Run as command line and eclipse Plugin.


struktur structure is:

| **Project** | | | |
|:------------|:|:|:|
|             | **Dependency** | all phase depends this dependencies. | |
|             | **Variables**  | all phase refer this variables.| |
|             | **Phase**      | phase contain _build_,_test_,_archive_.| |
|             |            | **Dependency** | phase scoped dependencies.|
|             |            | **Task** | looks like ant task. ex. javac,jar,running unit test.|