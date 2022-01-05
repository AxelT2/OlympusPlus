package java;

// Generated from C:/Users/baton/IdeaProjects/olympus\olympus.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link olympusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface olympusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link olympusParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(olympusParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(olympusParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(olympusParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#dlc_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDlc_int(olympusParser.Dlc_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#dlc_deci}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDlc_deci(olympusParser.Dlc_deciContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#dlc_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDlc_string(olympusParser.Dlc_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#dlc_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDlc_char(olympusParser.Dlc_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#dlc_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDlc_bool(olympusParser.Dlc_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#empty_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_string(olympusParser.Empty_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#if_exception_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_exception_sentence(olympusParser.If_exception_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#dlc_int2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDlc_int2(olympusParser.Dlc_int2Context ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#dlc_deci2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDlc_deci2(olympusParser.Dlc_deci2Context ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#dlc_string2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDlc_string2(olympusParser.Dlc_string2Context ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#dlc_char2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDlc_char2(olympusParser.Dlc_char2Context ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#dlc_bool2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDlc_bool2(olympusParser.Dlc_bool2Context ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#dlc_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDlc_array(olympusParser.Dlc_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#println2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln2(olympusParser.Println2Context ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#print2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint2(olympusParser.Print2Context ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#var_deci}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_deci(olympusParser.Var_deciContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(olympusParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(olympusParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(olympusParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(olympusParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#aritmetic_sentences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmetic_sentences(olympusParser.Aritmetic_sentencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#olim_sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOlim_sum(olympusParser.Olim_sumContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#olim_min}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOlim_min(olympusParser.Olim_minContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#olim_mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOlim_mult(olympusParser.Olim_multContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#olim_div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOlim_div(olympusParser.Olim_divContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#olim_per}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOlim_per(olympusParser.Olim_perContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#dlc_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDlc_for(olympusParser.Dlc_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#dlc_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDlc_while(olympusParser.Dlc_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#dlc_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDlc_if(olympusParser.Dlc_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#if_sentences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_sentences(olympusParser.If_sentencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#gt_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt_than(olympusParser.Gt_thanContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#gt_eq_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt_eq_than(olympusParser.Gt_eq_thanContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#ls_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLs_than(olympusParser.Ls_thanContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#ls_eq_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLs_eq_than(olympusParser.Ls_eq_thanContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#eq_eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_eq(olympusParser.Eq_eqContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#ne_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNe_than(olympusParser.Ne_thanContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#decitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecitions(olympusParser.DecitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#class_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type(olympusParser.Class_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#public_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublic_class(olympusParser.Public_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#private_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivate_class(olympusParser.Private_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link olympusParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(olympusParser.ArrayContext ctx);
}