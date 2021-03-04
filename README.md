Social Networking Kata

In this project I used Spring-boot (MVC) for dependency management and Junit 5 for automated test.

The main idea is to allow users to post (publish) thire messages into a Timeline, and the Timeline is visiable by all the followrs; so, if Charlie follows Alice, Charlie will be able to see all Alice's posts.

And of course, the system give the ablity add a new post into your timeline.

I used MVC methodolgy to develop this tool:
Models
  User (id and name)
  Post (id and Message)
  Timeline (id, owner, posts)
  Followers (id, owner, users
 
Contollers
  FollowController: to handel the "Follow" request
  PostController: to publish a new message
  Timeline: to show all the posts
  
View
  index.html: default page
