package com.optum.rxclaimnextgen.elg.pojo;

public class TypeAheadType {	
	
	private String languageCode;
    private String languageName;
    
    public TypeAheadType() {
		
	}  
    public TypeAheadType(String languageCode) {
		super();
		this.languageCode = languageCode;		
	} 
    public TypeAheadType(String languageCode, String languageName) {
		super();
		this.languageCode = languageCode;
		this.languageName = languageName;
	}    
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

}
