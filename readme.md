## HttpClient
### Quick Start
```

	// 创建客户端对象
	HttpClient client = new HttpClient("http://www.baidu.com", Method.GET);
	// 发送请求
    client.connect();
    // 得到响应
    String resp = client.getResponse();
    // 得到头信息
    Map<String, List<String >> headerList = client.getHeaders();
    
    // 重置之后可以重复使用HttpClient对象
    client.reset();
    client.setUrl("XXX);
    client.setMethod(Method.POST);
    client.setQueryString("username=hello&age=18");
    client.connect();
    ... ...
```