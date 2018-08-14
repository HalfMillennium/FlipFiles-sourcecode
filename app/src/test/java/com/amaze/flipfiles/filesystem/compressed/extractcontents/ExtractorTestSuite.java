package com.amaze.flipfiles.filesystem.compressed.extractcontents;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TarGzExtractorTest.class,
        ZipExtractorTest.class,
        TarExtractorTest.class,
        RarExtractorTest.class
})
public class ExtractorTestSuite {
}
