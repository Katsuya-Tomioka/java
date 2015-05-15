/******************************************************************************
 ** This data and information is proprietary to, and a valuable trade secret
 ** of, Basis Technology Corp.  It is given in confidence by Basis Technology
 ** and may only be used as permitted under the license agreement under which
 ** it has been distributed, and in no other way.
 **
 ** Copyright (c) 2015 Basis Technology Corporation All rights reserved.
 **
 ** The technical data and information provided herein are provided with
 ** `limited rights', and the computer software provided herein is provided
 ** with `restricted rights' as those terms are defined in DAR and ASPR
 ** 7-104.9(a).
 ******************************************************************************/

package com.basistech.rosette.model;

/**
 * lemma (canonical form) of the word
 */
public class Lemma {
    private String text;
    private String lemma;

    public Lemma() { }

    /**
     * constructor for {@code lemma}
     * @param text text
     * @param lemma lemma
     */
    public Lemma(
            String text, 
            String lemma
    ) {
        this.text = text;
        this.lemma = lemma;
    }

    /**
     * get the text 
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * get the lemma
     * @return the lemma
     */
    public String getLemma() {
        return lemma;
    }
}