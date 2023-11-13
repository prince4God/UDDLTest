package com.epistimis.uddl.ui.hover;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class UddlKeywordHoverText {
  public static final String dmKeywordHover = new Function0<String>() {
    @Override
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("A DataModel is a container for ConceptualDataModels, LogicalDataModels, and PlatformDataModels");
      _builder.newLine();
      return _builder.toString();
    }
  }.apply();

  public static final String cdmKeywordHover = new Function0<String>() {
    @Override
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("A ConceptualDataModel is a container for CDM Elements (including nested CDMs).");
      _builder.newLine();
      return _builder.toString();
    }
  }.apply();

  public static final String ldmKeywordHover = new Function0<String>() {
    @Override
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("A LogicalDataModel is a container for LDM Elements (including nested LDMs).");
      _builder.newLine();
      return _builder.toString();
    }
  }.apply();

  public static final String pdmKeywordHover = new Function0<String>() {
    @Override
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("A PlatformDataModel is a container for PDM Elements (including nested PDMs).");
      _builder.newLine();
      return _builder.toString();
    }
  }.apply();
}
