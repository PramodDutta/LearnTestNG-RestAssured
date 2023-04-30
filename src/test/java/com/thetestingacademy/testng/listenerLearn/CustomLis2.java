package com.thetestingacademy.testng.listenerLearn;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.CustomAttribute;
import org.testng.annotations.ITestAnnotation;

public class CustomLis2 implements ITestAnnotation {
    @Override
    public int getInvocationCount() {
        return 0;
    }

    @Override
    public void setInvocationCount(int i) {

    }

    @Override
    public int getThreadPoolSize() {
        return 0;
    }

    @Override
    public void setThreadPoolSize(int i) {

    }

    @Override
    public int getSuccessPercentage() {
        return 0;
    }

    @Override
    public void setSuccessPercentage(int i) {

    }

    @Override
    public boolean getAlwaysRun() {
        return false;
    }

    @Override
    public void setAlwaysRun(boolean b) {

    }

    @Override
    public Class<?>[] getExpectedExceptions() {
        return new Class[0];
    }

    @Override
    public void setExpectedExceptions(Class<?>[] classes) {

    }

    @Override
    public String getExpectedExceptionsMessageRegExp() {
        return null;
    }

    @Override
    public void setExpectedExceptionsMessageRegExp(String s) {

    }

    @Override
    public String getSuiteName() {
        return null;
    }

    @Override
    public void setSuiteName(String s) {

    }

    @Override
    public String getTestName() {
        return null;
    }

    @Override
    public void setTestName(String s) {

    }

    @Override
    public boolean getSingleThreaded() {
        return false;
    }

    @Override
    public void setSingleThreaded(boolean b) {

    }

    @Override
    public String getDataProvider() {
        return null;
    }

    @Override
    public void setDataProvider(String s) {

    }

    @Override
    public Class<?> getDataProviderClass() {
        return null;
    }

    @Override
    public void setDataProviderClass(Class<?> aClass) {

    }

    @Override
    public String getDataProviderDynamicClass() {
        return null;
    }

    @Override
    public void setDataProviderDynamicClass(String s) {

    }

    @Override
    public void setRetryAnalyzer(Class<? extends IRetryAnalyzer> aClass) {

    }

    @Override
    public Class<? extends IRetryAnalyzer> getRetryAnalyzerClass() {
        return null;
    }

    @Override
    public boolean skipFailedInvocations() {
        return false;
    }

    @Override
    public void setSkipFailedInvocations(boolean b) {

    }

    @Override
    public long invocationTimeOut() {
        return 0;
    }

    @Override
    public void setInvocationTimeOut(long l) {

    }

    @Override
    public boolean ignoreMissingDependencies() {
        return false;
    }

    @Override
    public void setIgnoreMissingDependencies(boolean b) {

    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public void setPriority(int i) {

    }

    @Override
    public CustomAttribute[] getAttributes() {
        return new CustomAttribute[0];
    }

    @Override
    public void setAttributes(CustomAttribute[] customAttributes) {

    }

    @Override
    public long getTimeOut() {
        return 0;
    }

    @Override
    public void setTimeOut(long l) {

    }

    @Override
    public String[] getGroups() {
        return new String[0];
    }

    @Override
    public void setGroups(String[] strings) {

    }

    @Override
    public String[] getDependsOnGroups() {
        return new String[0];
    }

    @Override
    public void setDependsOnGroups(String[] strings) {

    }

    @Override
    public String[] getDependsOnMethods() {
        return new String[0];
    }

    @Override
    public void setDependsOnMethods(String[] strings) {

    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void setDescription(String s) {

    }

    @Override
    public boolean getEnabled() {
        return false;
    }

    @Override
    public void setEnabled(boolean b) {

    }
}
