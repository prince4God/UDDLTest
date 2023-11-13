package com.epistimis.uddl.ui.hover;

import com.epistimis.uddl.services.UddlGrammarAccess;
import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.xtext.Keyword;

/**
 * From blog post
 * https://blogs.itemis.com/en/xtext-usability-hovers-on-keywords
 * Alternatively, see https://ckulla.wordpress.com/2011/02/06/hover-support-in-xtext-2-0/
 * 
 * Just update this file with keyword hover text.
 */
@SuppressWarnings("all")
public class UddlKeywordHovers {
  @Inject
  private UddlGrammarAccess ga;

  public String hoverText(final Keyword k) {
    String _xblockexpression = null;
    {
      String _switchResult = null;
      boolean _matched = false;
      Keyword _dmKeyword_0 = this.ga.getDataModelAccess().getDmKeyword_0();
      if (Objects.equal(k, _dmKeyword_0)) {
        _matched=true;
        _switchResult = UddlKeywordHoverText.dmKeywordHover;
      }
      if (!_matched) {
        Keyword _cdmKeyword_0 = this.ga.getConceptualDataModelAccess().getCdmKeyword_0();
        if (Objects.equal(k, _cdmKeyword_0)) {
          _matched=true;
          _switchResult = UddlKeywordHoverText.cdmKeywordHover;
        }
      }
      if (!_matched) {
        Keyword _ldmKeyword_0 = this.ga.getLogicalDataModelAccess().getLdmKeyword_0();
        if (Objects.equal(k, _ldmKeyword_0)) {
          _matched=true;
          _switchResult = UddlKeywordHoverText.ldmKeywordHover;
        }
      }
      if (!_matched) {
        Keyword _pdmKeyword_0 = this.ga.getPlatformDataModelAccess().getPdmKeyword_0();
        if (Objects.equal(k, _pdmKeyword_0)) {
          _matched=true;
          _switchResult = UddlKeywordHoverText.pdmKeywordHover;
        }
      }
      if (!_matched) {
        String _string = k.toString();
        String _plus = ("<need to implement hover for :" + _string);
        String _plus_1 = (_plus + " for feature ");
        String _string_1 = k.eContainingFeature().toString();
        String _plus_2 = (_plus_1 + _string_1);
        _switchResult = (_plus_2 + ">");
      }
      final String result = _switchResult;
      _xblockexpression = result.toString();
    }
    return _xblockexpression;
  }
}
