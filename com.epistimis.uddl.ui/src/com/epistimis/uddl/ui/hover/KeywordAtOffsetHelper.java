package com.epistimis.uddl.ui.hover;


/**
 * From blog post
 * https://blogs.itemis.com/en/xtext-usability-hovers-on-keywords
 */
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;
/** Inspired by {@link org.eclipse.xtext.resource.EObjectAtOffsetHelper} */
public class KeywordAtOffsetHelper {

	  public Pair<EObject, IRegion> resolveKeywordAt(XtextResource resource, int offset) {
		    IParseResult parseResult = resource.getParseResult();
		    if (parseResult != null) {
		      ILeafNode leaf = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), offset);
		      if (leaf != null && leaf.isHidden() && leaf.getOffset() == offset) {
		        leaf = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), offset - 1);
		      }
		      if (leaf != null && leaf.getGrammarElement() instanceof Keyword) {
		        Keyword keyword = (Keyword) leaf.getGrammarElement();
		        return Tuples.create((EObject) keyword, (IRegion)new Region(leaf.getOffset(), leaf.getLength()));
		      }
		    }
		    return null;
		  }

}
