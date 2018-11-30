package com.tensorflowJS.lang;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.javascript.DialectOptionHolder;
import com.intellij.lang.javascript.JSLanguageDialect;
import com.intellij.lang.javascript.parsing.JavaScriptParser;
import com.tensorflowJS.parser.TensorFlowJSParser;
import org.jetbrains.annotations.NotNull;




/**
 * @author Umang Sharma
 */
public class TensorFlowJSLanguage extends JSLanguageDialect {
    public static final TensorFlowJSLanguage INSTANCE = new TensorFlowJSLanguage();

    protected TensorFlowJSLanguage() {
        super("TensorFlowJS", DialectOptionHolder.OTHER);
    }

    @Override
    public String getFileExtension() {
        return "js";
    }

    @Override
    public JavaScriptParser<?, ?, ?, ?> createParser(@NotNull PsiBuilder builder) {
        return new TensorFlowJSParser(builder);
    }
}