# 练习
1. 我们发现查询所有学生的这个接口比较慢
2. 我们想用Redis来提高速度，因为Redis的响应要快于MySQL的查询
3. 我们改造查询所有学生{Name, Age}的流程
   1. 首先查询Redis中是否有所有学生的情况，如果有直接返回
   2. 如果没有，
      1. 先查询数据库，在保存到Redis中，
      2. 然后返回

   Student -> StudentMetadata{Name, Age}



# 实践
假如我们在做一个学生管理系统
现在我们还没有做好学生部分的管理，
1。 主要还是学生个人信息的修改，
2。 所有学生的信息查询
3。 新学生的添加
我们希望对前端提供几个接口，让前端能够通过这些接口
完成相应的操作。
希望你完成设计，开发

# 需求
用户传入他们的GitHub id，我们要返回他的GitHub最近的提交记录
1. 我们提供一个API出去
GET /api/querygithub?githubid=<>
2. 我们又要去查询github api
这个时候，我们就变成流github api的消费者
3. 这就意味着我们需要通过okhttp这样的客户端来帮助我们发送http请求

// models
// class GithubEventResponse {
// ...
// }

// service
// OkHttpClient client;
// Request request = new Request.Builder()...
// client.newCall(request).execute()
// 
// GithubEventResponse response = readValue(responseBody.string(), GithubEventResponse.class)
// 这样把需要的数据 转换了具体的类型

// return response

// Controller

// @RequestParam String githubID

// return githubService.queryEvents(githubID)

