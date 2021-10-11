# instrument-families
A program that utilizes abstract classes to compile a list of instruments from different instrument families.

## Assignment
Write a program that will compile a list of instruments from different instrument families. A family of musical Instruments is a grouping of several different but related sizes or types of instruments.
Some commonly recognized families are:
- Brass Family - A brass instrument is a musical instrument that produces sound by sympatheticvibration of air in a tubular resonator in sympathy with the vibration of the player's lips. Ref: https://en.wikipedia.org/wiki/Brass_instrument
- Strings Family - String instruments, stringed instruments, or chordophones are musicalinstruments that produce sound from vibrating strings. Ref: https://en.wikipedia.org/wiki/String_instrument
- Woodwind Family - Woodwind instruments are a family of musical instruments within the moregeneral category of wind instruments. There are two main types of woodwind instruments:flutes and reed instruments (otherwise called reed pipes). What differentiates theseinstruments from other wind instruments is the way in which they produce their sound. Ref: https://en.wikipedia.org/wiki/Woodwind_instrument
- Percussion Family - A percussion instrument is a musical instrument that is sounded by beingstruck or scraped by a beater (including attached or enclosed beaters or rattles); struck, scrapedor rubbed by hand; or struck against another similar instrument. Ref: https://en.wikipedia.org/wiki/Percussion_instrument

## Constraints
- Limit the number of families to the list above.
- Use one separate (external to the main class) abstract super class: Instrument.
- Use three separate (external to the main class) abstract subclasses that extend Instrument:
  - BlownInstrument
  - Fingered
  - Struck
- Use four separate (external to the main class) subclasses (families) that extend the appropriate three above:
  - Brass
  - Strings
  - Woodwind
  - Percussion

## Requirements
- Display the menu shown in the example output below.
- Request the number of instruments to be entered.
- All instruments should be placed into an array (you can use one array per family or one array for all entered) so they may be displayed.
- Use set and get methods where appropriate.
- Implement a loop that will allow the user to enter more instruments.
- Use exception handling and validation where appropriate.
