package com.tensorflowJS.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.tensorflowJS.TensorFlowIcon;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * @author Umang Sharma
 */
public class TensorFlowJSFileType extends LanguageFileType {

    public static final TensorFlowJSFileType INSTANCE = new TensorFlowJSFileType();

    private TensorFlowJSFileType() {
        super(TensorFlowJSLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "TensorFlow JS File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "TensorFlow JS";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "js";
    }


    @Override
    public Icon getIcon() {
        return TensorFlowIcon.FILE;
    }
}