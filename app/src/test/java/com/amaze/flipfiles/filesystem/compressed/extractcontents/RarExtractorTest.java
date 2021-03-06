package com.amaze.flipfiles.filesystem.compressed.extractcontents;

import com.amaze.flipfiles.filesystem.compressed.extractcontents.helpers.RarExtractor;

public class RarExtractorTest extends AbstractExtractorTest {
    @Override
    protected String getArchiveType() {
        return "rar";
    }

    @Override
    protected Class<? extends Extractor> extractorClass() {
        return RarExtractor.class;
    }
}
