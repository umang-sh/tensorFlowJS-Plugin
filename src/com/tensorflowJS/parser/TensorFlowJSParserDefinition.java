package com.tensorflowJS.parser;



import com.intellij.lang.PsiParser;
import com.intellij.lang.javascript.JavascriptParserDefinition;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.tree.IFileElementType;
import com.tensorflowJS.lang.lexer.TensorFlowJSLexer;
import org.jetbrains.annotations.NotNull;

/**
 * @author Dennis.Ushakov
 */
public class TensorFlowJSParserDefinition extends JavascriptParserDefinition {
    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new TensorFlowJSLexer();
    }

    @NotNull
    @Override
    public PsiParser createParser(Project project) {
        return new TensorParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return TensorFlowJSElementTypes.FILE;
    }
}
