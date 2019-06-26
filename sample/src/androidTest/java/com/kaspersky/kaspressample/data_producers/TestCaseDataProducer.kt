package com.kaspersky.kaspressample.data_producers

import com.kaspersky.kaspressample.data.TestCaseData
import com.kaspersky.kaspressample.data.TestCaseDsl

class TestCaseDataProducer {

    /**
     * Init data f.e. with a server and transform it to testcase abstractions
     */
    fun initData(action: (TestCaseDsl.() -> Unit)?): TestCaseData {
        val testCaseDsl = TestCaseDsl().also { testCaseDsl -> action?.let { testCaseDsl.apply(it) } }
        // Init data at server side or by another way
        return TestCaseData(testCaseDsl.companies, testCaseDsl.owners)
    }
}