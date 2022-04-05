# FIX Protocol

## History
FIX is a protocol that initiated in 1992 for international real-time exchange of information related to securities transactions and markets. The
protocol developed by Robert Lamoureux and Chris Morstatt to enable electronic communication of equity trading data between [Fidelity Investments](https://www.fidelity.com/) and
[Salomon Brothers](https://en.wikipedia.org/wiki/Salomon_Brothers).

## FIX Tag Value Message Format

Message fields are delimited by ASCII 01 <start of header> character. They are composed of a header, a body and a trailer.
Up to FIX.4.4,the header contained three fields: 8 ```(BeginString)```, ```(BodyLength)```, and 35 ```(MsgType)``` tags.

From FIXT.1.1 / FIX.5.0, the header contains 5 mandatory fields and one optional field: 8 ```(BeginString)```, 9 ```(BodyLength)```, 35 ```(MsgType)```, 49 ```(SenderCompID)```, 56 ```(TargetCompID)```, and 1128 ```(ApplVerID``` - if present must be in 6th position).

The last field of message is tag 10, FIX Message Checksum. It always expressed as a three-digit number (e.g. ```10=002```).

Header + Body + Trailer : FIX Content ->
```8=FIX.4.2 | 9=178 | 35=8 | 49=PHLX | 56=PERS | 52=20071123-05:30:00.000 | 11=ATOMNOCCC9990900 | 20=3 | 150=E | 39=E | 55=MSFT | 167=CS | 54=1 | 38=15 | 40=2 | 44=15 | 58=PHLX EQUITY TESTING | 59=0 | 47=C | 32=0 | 31=0 | 151=15 | 14=0 | 6=0 | 10=128 | ```

In the above message, Body Lenght 9 is correct and checksum 10 was checked out by using the source available from [QuickFIX](https://en.wikipedia.org/wiki/QuickFIX), an open-source FIX implementation. 

## Body

FIX messages are formed from several fields; each field has a tag value pairing that is seperated from next field by a delimiter [SOH](https://en.wikipedia.org/wiki/C0_and_C1_control_codes#SOH) (0x01). The tag is an integer that indicated the meaning of field.

The FIX protocol also defines sets of field that make a particular message. Some of fields will be mandatory and others optional. The ordering of fields within the message usually unimportant, however repeating groups are preceded by a count and encrypted fields are preceded by their length.

The message broken into three sections:
- Head
- Body
- Tail

Fields must remain within the correct section and within each section, position may be important as fields can act as delimiters that stop one message from running into the next. The final field in any FIX message is tag 10.

## Body Length

Body length is the character count starting at tag by 35 (included) all the way to tag 10 (excluded). SOH delimiters do count in body length.
E.g: (SOH replaced by "|")

```8=FIX.4.2|9=65|35=A|49=SERVER|56=CLIENT|34=177|52=20090107-18:15:16|98=0|108=30|10=062|```

```     0   + 0  + 5  +   10    +   10    +  7   +        21          + 5  +  7   +   0    = 65```

Has a Body Length of 65. The SOH delimiter at the end of a Tag=Value belongs to the Tag.

