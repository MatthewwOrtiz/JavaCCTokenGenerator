/* Generated By:JavaCC: Do not edit this line. ParserTokenManager.java */
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/** Token Manager. */
public class ParserTokenManager implements ParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x2000000000008L) != 0L)
            return 0;
         if ((active0 & 0x20000000000000L) != 0L)
         {
            jjmatchedKind = 58;
            return 9;
         }
         if ((active0 & 0x1d9e01e201f0000L) != 0L)
         {
            jjmatchedKind = 58;
            return 22;
         }
         return -1;
      case 1:
         if ((active0 & 0x1f9c01e201f0000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 1;
            return 22;
         }
         if ((active0 & 0x200000000000L) != 0L)
            return 22;
         return -1;
      case 2:
         if ((active0 & 0x60400020080000L) != 0L)
            return 22;
         if ((active0 & 0x199801e00170000L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 58;
               jjmatchedPos = 2;
            }
            return 22;
         }
         return -1;
      case 3:
         if ((active0 & 0xd98016001d0000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 3;
            return 22;
         }
         if ((active0 & 0x100000800020000L) != 0L)
            return 22;
         return -1;
      case 4:
         if ((active0 & 0xc88014001d0000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 4;
            return 22;
         }
         if ((active0 & 0x11000200000000L) != 0L)
            return 22;
         return -1;
      case 5:
         if ((active0 & 0xc00004000d0000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 5;
            return 22;
         }
         if ((active0 & 0x8801000100000L) != 0L)
            return 22;
         return -1;
      case 6:
         if ((active0 & 0x400000000c0000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 6;
            return 22;
         }
         if ((active0 & 0x80000400010000L) != 0L)
            return 22;
         return -1;
      case 7:
         if ((active0 & 0x40000000040000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 7;
            return 22;
         }
         if ((active0 & 0x80000L) != 0L)
            return 22;
         return -1;
      case 8:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 8;
            return 22;
         }
         if ((active0 & 0x40000000000000L) != 0L)
            return 22;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 50;
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 35:
         return jjStopAtPos(0, 57);
      case 37:
         return jjStopAtPos(0, 21);
      case 38:
         return jjStopAtPos(0, 25);
      case 40:
         return jjStopAtPos(0, 42);
      case 41:
         return jjStopAtPos(0, 27);
      case 42:
         return jjStopAtPos(0, 12);
      case 43:
         return jjStopAtPos(0, 11);
      case 44:
         return jjStopAtPos(0, 15);
      case 45:
         return jjStopAtPos(0, 13);
      case 46:
         return jjStopAtPos(0, 30);
      case 47:
         jjmatchedKind = 49;
         return jjMoveStringLiteralDfa1_0(0x8L);
      case 59:
         return jjStopAtPos(0, 14);
      case 60:
         jjmatchedKind = 38;
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 61:
         jjmatchedKind = 41;
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 62:
         jjmatchedKind = 24;
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 91:
         return jjStopAtPos(0, 31);
      case 93:
         return jjStopAtPos(0, 26);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x200010000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x10000000000000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x8000000000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x400020000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x20000000000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x40200020040000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x400800080000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x80000000000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x800000100000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x100000000000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x1000000000000L);
      case 123:
         return jjStopAtPos(0, 43);
      case 124:
         return jjStopAtPos(0, 32);
      case 125:
         return jjStopAtPos(0, 44);
      default :
         return jjMoveNfa_0(2, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x8L) != 0L)
            return jjStopAtPos(1, 3);
         break;
      case 61:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(1, 22);
         else if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(1, 23);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(1, 39);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0xc00000180000L);
      case 102:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 45, 22);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000020000L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000020000000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x128000000010000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000200000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x10800000000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x181000000000000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 114:
         if ((active0 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 53, 22);
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 116:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x40000400100000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000000L);
      case 119:
         if ((active0 & 0x400000000000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x200080000L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000000000L);
      case 100:
         if ((active0 & 0x100000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 56, 22);
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000000L);
      case 101:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 22);
         return jjMoveStringLiteralDfa4_0(active0, 0x40000400000000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000000L);
      case 108:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(3, 35, 22);
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000050000L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000000000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 48, 22);
         return jjMoveStringLiteralDfa5_0(active0, 0x50000L);
      case 107:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(4, 33, 22);
         break;
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x8800000000000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x1400000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000180000L);
      case 115:
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 52, 22);
         break;
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000000L);
      case 101:
         if ((active0 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 51, 22);
         break;
      case 102:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000000000L);
      case 103:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 36, 22);
         break;
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000000000L);
      case 109:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000L);
      case 110:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(5, 20, 22);
         else if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 47, 22);
         break;
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000000080000L);
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000L);
      case 110:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(6, 16, 22);
         else if ((active0 & 0x80000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 55, 22);
         break;
      case 115:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(6, 34, 22);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x40000000000000L);
      case 110:
         return jjMoveStringLiteralDfa8_0(active0, 0x40000L);
      case 121:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(7, 19, 22);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x40000000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 54, 22);
         break;
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 115:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(9, 18, 22);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 22;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 22:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 58)
                        kind = 58;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 36)
                  {
                     if (kind > 58)
                        kind = 58;
                  }
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 58)
                        kind = 58;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 36)
                  {
                     if (kind > 58)
                        kind = 58;
                  }
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 10)
                        kind = 10;
                     jjCheckNAddStates(3, 5);
                  }
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(12, 13);
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar != 47)
                     break;
                  if (kind > 2)
                     kind = 2;
                  jjCheckNAdd(1);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 2)
                     kind = 2;
                  jjCheckNAdd(1);
                  break;
               case 11:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(12, 13);
                  break;
               case 12:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddTwoStates(12, 13);
                  break;
               case 13:
                  if (curChar == 34 && kind > 37)
                     kind = 37;
                  break;
               case 15:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  jjCheckNAddStates(0, 2);
                  break;
               case 16:
                  if (curChar == 36 && kind > 58)
                     kind = 58;
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(3, 5);
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(18, 19);
                  break;
               case 19:
                  if (curChar == 46)
                     jjCheckNAdd(20);
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAdd(20);
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAdd(21);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 22:
               case 14:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  jjCheckNAddStates(0, 2);
                  break;
               case 9:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 58)
                        kind = 58;
                     jjCheckNAddStates(0, 2);
                  }
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 2:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 58)
                        kind = 58;
                     jjCheckNAddStates(0, 2);
                  }
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 9;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 1:
                  if (kind > 2)
                     kind = 2;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 3:
                  if (curChar == 101 && kind > 28)
                     kind = 28;
                  break;
               case 4:
                  if (curChar == 117)
                     jjCheckNAdd(3);
                  break;
               case 5:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 115)
                     jjCheckNAdd(3);
                  break;
               case 8:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 10:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 12:
                  jjAddStates(6, 7);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 2)
                     kind = 2;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 12:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(6, 7);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 22 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x80L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   14, 15, 16, 18, 19, 21, 12, 13, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, "\53", "\52", 
"\55", "\73", "\54", "\142\157\157\154\145\141\156", "\145\154\163\145", 
"\151\155\160\154\145\155\145\156\164\163", "\156\145\167\141\162\162\141\171", "\162\145\164\165\162\156", "\45", 
"\76\75", "\74\75", "\76", "\46", "\135", "\51", null, "\151\156\164", "\56", "\133", 
"\174", "\142\162\145\141\153", "\145\170\164\145\156\144\163", "\156\165\154\154", 
"\163\164\162\151\156\147", null, "\74", "\41\75", "\75\75", "\75", "\50", "\173", "\175", "\151\146", 
"\156\145\167", "\162\145\141\144\154\156", "\167\150\151\154\145", "\57", "\41", 
"\144\157\165\142\154\145", "\143\154\141\163\163", "\146\157\162", 
"\151\156\164\145\162\146\141\143\145", "\160\162\151\156\164\154\156", "\166\157\151\144", "\43", null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "ML_COMMENT_STATE",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, 1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x7fffffffffffe01L, 
};
static final long[] jjtoSkip = {
   0x1feL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[22];
private final int[] jjstateSet = new int[44];
protected char curChar;
/** Constructor. */
public ParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public ParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 22; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       if (jjmatchedPos == 0 && jjmatchedKind > 8)
       {
          jjmatchedKind = 8;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
