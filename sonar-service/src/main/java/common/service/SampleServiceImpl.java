package common.service;


import common.facade.SampleService;

public class SampleServiceImpl implements SampleService {

    @Override
    public String message() {
        return "Hello, Service slitecore";
    }
}
