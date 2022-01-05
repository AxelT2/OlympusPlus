package java;

// Generated from C:/Users/baton/IdeaProjects/olympus\olympus.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link olympusParser}.
 */
public interface olympusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link olympusParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(olympusParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(olympusParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(olympusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(olympusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(olympusParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(olympusParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#dlc_int}.
	 * @param ctx the parse tree
	 */
	void enterDlc_int(olympusParser.Dlc_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#dlc_int}.
	 * @param ctx the parse tree
	 */
	void exitDlc_int(olympusParser.Dlc_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#dlc_deci}.
	 * @param ctx the parse tree
	 */
	void enterDlc_deci(olympusParser.Dlc_deciContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#dlc_deci}.
	 * @param ctx the parse tree
	 */
	void exitDlc_deci(olympusParser.Dlc_deciContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#dlc_string}.
	 * @param ctx the parse tree
	 */
	void enterDlc_string(olympusParser.Dlc_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#dlc_string}.
	 * @param ctx the parse tree
	 */
	void exitDlc_string(olympusParser.Dlc_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#dlc_char}.
	 * @param ctx the parse tree
	 */
	void enterDlc_char(olympusParser.Dlc_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#dlc_char}.
	 * @param ctx the parse tree
	 */
	void exitDlc_char(olympusParser.Dlc_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#dlc_bool}.
	 * @param ctx the parse tree
	 */
	void enterDlc_bool(olympusParser.Dlc_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#dlc_bool}.
	 * @param ctx the parse tree
	 */
	void exitDlc_bool(olympusParser.Dlc_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#empty_string}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_string(olympusParser.Empty_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#empty_string}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_string(olympusParser.Empty_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#if_exception_sentence}.
	 * @param ctx the parse tree
	 */
	void enterIf_exception_sentence(olympusParser.If_exception_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#if_exception_sentence}.
	 * @param ctx the parse tree
	 */
	void exitIf_exception_sentence(olympusParser.If_exception_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#dlc_int2}.
	 * @param ctx the parse tree
	 */
	void enterDlc_int2(olympusParser.Dlc_int2Context ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#dlc_int2}.
	 * @param ctx the parse tree
	 */
	void exitDlc_int2(olympusParser.Dlc_int2Context ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#dlc_deci2}.
	 * @param ctx the parse tree
	 */
	void enterDlc_deci2(olympusParser.Dlc_deci2Context ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#dlc_deci2}.
	 * @param ctx the parse tree
	 */
	void exitDlc_deci2(olympusParser.Dlc_deci2Context ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#dlc_string2}.
	 * @param ctx the parse tree
	 */
	void enterDlc_string2(olympusParser.Dlc_string2Context ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#dlc_string2}.
	 * @param ctx the parse tree
	 */
	void exitDlc_string2(olympusParser.Dlc_string2Context ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#dlc_char2}.
	 * @param ctx the parse tree
	 */
	void enterDlc_char2(olympusParser.Dlc_char2Context ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#dlc_char2}.
	 * @param ctx the parse tree
	 */
	void exitDlc_char2(olympusParser.Dlc_char2Context ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#dlc_bool2}.
	 * @param ctx the parse tree
	 */
	void enterDlc_bool2(olympusParser.Dlc_bool2Context ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#dlc_bool2}.
	 * @param ctx the parse tree
	 */
	void exitDlc_bool2(olympusParser.Dlc_bool2Context ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#dlc_array}.
	 * @param ctx the parse tree
	 */
	void enterDlc_array(olympusParser.Dlc_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#dlc_array}.
	 * @param ctx the parse tree
	 */
	void exitDlc_array(olympusParser.Dlc_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#println2}.
	 * @param ctx the parse tree
	 */
	void enterPrintln2(olympusParser.Println2Context ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#println2}.
	 * @param ctx the parse tree
	 */
	void exitPrintln2(olympusParser.Println2Context ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#print2}.
	 * @param ctx the parse tree
	 */
	void enterPrint2(olympusParser.Print2Context ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#print2}.
	 * @param ctx the parse tree
	 */
	void exitPrint2(olympusParser.Print2Context ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#var_deci}.
	 * @param ctx the parse tree
	 */
	void enterVar_deci(olympusParser.Var_deciContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#var_deci}.
	 * @param ctx the parse tree
	 */
	void exitVar_deci(olympusParser.Var_deciContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(olympusParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(olympusParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(olympusParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(olympusParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(olympusParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(olympusParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(olympusParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(olympusParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#aritmetic_sentences}.
	 * @param ctx the parse tree
	 */
	void enterAritmetic_sentences(olympusParser.Aritmetic_sentencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#aritmetic_sentences}.
	 * @param ctx the parse tree
	 */
	void exitAritmetic_sentences(olympusParser.Aritmetic_sentencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#olim_sum}.
	 * @param ctx the parse tree
	 */
	void enterOlim_sum(olympusParser.Olim_sumContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#olim_sum}.
	 * @param ctx the parse tree
	 */
	void exitOlim_sum(olympusParser.Olim_sumContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#olim_min}.
	 * @param ctx the parse tree
	 */
	void enterOlim_min(olympusParser.Olim_minContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#olim_min}.
	 * @param ctx the parse tree
	 */
	void exitOlim_min(olympusParser.Olim_minContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#olim_mult}.
	 * @param ctx the parse tree
	 */
	void enterOlim_mult(olympusParser.Olim_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#olim_mult}.
	 * @param ctx the parse tree
	 */
	void exitOlim_mult(olympusParser.Olim_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#olim_div}.
	 * @param ctx the parse tree
	 */
	void enterOlim_div(olympusParser.Olim_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#olim_div}.
	 * @param ctx the parse tree
	 */
	void exitOlim_div(olympusParser.Olim_divContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#olim_per}.
	 * @param ctx the parse tree
	 */
	void enterOlim_per(olympusParser.Olim_perContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#olim_per}.
	 * @param ctx the parse tree
	 */
	void exitOlim_per(olympusParser.Olim_perContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#dlc_for}.
	 * @param ctx the parse tree
	 */
	void enterDlc_for(olympusParser.Dlc_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#dlc_for}.
	 * @param ctx the parse tree
	 */
	void exitDlc_for(olympusParser.Dlc_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#dlc_while}.
	 * @param ctx the parse tree
	 */
	void enterDlc_while(olympusParser.Dlc_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#dlc_while}.
	 * @param ctx the parse tree
	 */
	void exitDlc_while(olympusParser.Dlc_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#dlc_if}.
	 * @param ctx the parse tree
	 */
	void enterDlc_if(olympusParser.Dlc_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#dlc_if}.
	 * @param ctx the parse tree
	 */
	void exitDlc_if(olympusParser.Dlc_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#if_sentences}.
	 * @param ctx the parse tree
	 */
	void enterIf_sentences(olympusParser.If_sentencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#if_sentences}.
	 * @param ctx the parse tree
	 */
	void exitIf_sentences(olympusParser.If_sentencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#gt_than}.
	 * @param ctx the parse tree
	 */
	void enterGt_than(olympusParser.Gt_thanContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#gt_than}.
	 * @param ctx the parse tree
	 */
	void exitGt_than(olympusParser.Gt_thanContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#gt_eq_than}.
	 * @param ctx the parse tree
	 */
	void enterGt_eq_than(olympusParser.Gt_eq_thanContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#gt_eq_than}.
	 * @param ctx the parse tree
	 */
	void exitGt_eq_than(olympusParser.Gt_eq_thanContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#ls_than}.
	 * @param ctx the parse tree
	 */
	void enterLs_than(olympusParser.Ls_thanContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#ls_than}.
	 * @param ctx the parse tree
	 */
	void exitLs_than(olympusParser.Ls_thanContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#ls_eq_than}.
	 * @param ctx the parse tree
	 */
	void enterLs_eq_than(olympusParser.Ls_eq_thanContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#ls_eq_than}.
	 * @param ctx the parse tree
	 */
	void exitLs_eq_than(olympusParser.Ls_eq_thanContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#eq_eq}.
	 * @param ctx the parse tree
	 */
	void enterEq_eq(olympusParser.Eq_eqContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#eq_eq}.
	 * @param ctx the parse tree
	 */
	void exitEq_eq(olympusParser.Eq_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#ne_than}.
	 * @param ctx the parse tree
	 */
	void enterNe_than(olympusParser.Ne_thanContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#ne_than}.
	 * @param ctx the parse tree
	 */
	void exitNe_than(olympusParser.Ne_thanContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#decitions}.
	 * @param ctx the parse tree
	 */
	void enterDecitions(olympusParser.DecitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#decitions}.
	 * @param ctx the parse tree
	 */
	void exitDecitions(olympusParser.DecitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#class_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_type(olympusParser.Class_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#class_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_type(olympusParser.Class_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#public_class}.
	 * @param ctx the parse tree
	 */
	void enterPublic_class(olympusParser.Public_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#public_class}.
	 * @param ctx the parse tree
	 */
	void exitPublic_class(olympusParser.Public_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#private_class}.
	 * @param ctx the parse tree
	 */
	void enterPrivate_class(olympusParser.Private_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#private_class}.
	 * @param ctx the parse tree
	 */
	void exitPrivate_class(olympusParser.Private_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link olympusParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(olympusParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link olympusParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(olympusParser.ArrayContext ctx);
}