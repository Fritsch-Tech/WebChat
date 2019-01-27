import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        userId:"1",
        currentChannelId:"1",
        loadChannels:false,
        loadChat:false,
        users:[
            {
                id:"1",
                name:"Lukas",
                avatar:require("./assets/images/avatar.jpg")
            },
            {
                id:"2",
                name:"Test1",
                avatar:require("./assets/images/avatar2.jpg")
            },
            {
                id:"3",
                name:"Test2",
                avatar:require("./assets/images/avatar3.jpg")
            }
        ],
        channels:[
            {
                id:"1",
                name:"Test1 Chat",
                unreadMessages:false,
                loadingMessages:false,
                userIds:[
                    "1",
                    "2"
                ],
                messages:[
                    {
                        cipherMessage:"Hallo",
                        userId:"1"
                    },
                    {
                        cipherMessage:"Hallo1",
                        userId:"1"
                    },
                    {
                        cipherMessage:"Hallo2",
                        userId:"2"
                    },
                    {
                        cipherMessage:"Hallo3",
                        userId:"2"
                    },
                    {
                        cipherMessage:"Hallo1",
                        userId:"1"
                    },
                    {
                        cipherMessage:"Hallo2",
                        userId:"2"
                    },
                    {
                        cipherMessage:"Hallo3",
                        userId:"2"
                    },
                    {
                        cipherMessage:"Hallo1",
                        userId:"1"
                    },
                    {
                        cipherMessage:"Hallo2",
                        userId:"2"
                    },
                    {
                        cipherMessage:"Hallo3",
                        userId:"2"
                    },
                    {
                        cipherMessage:"Hallo1",
                        userId:"1"
                    },
                    {
                        cipherMessage:"Hallo2",
                        userId:"2"
                    },
                    {
                        cipherMessage:"Hallo3",
                        userId:"2"
                    },
                    {
                        cipherMessage:"Hallo1",
                        userId:"1"
                    },
                    {
                        cipherMessage:"Hallo2",
                        userId:"2"
                    },
                    {
                        cipherMessage:"Hallo3",
                        userId:"2"
                    }
                ]
            },{
                id:"2",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                    {
                        cipherMessage:"Hallo",
                        userId:"1"
                    },
                    {
                        cipherMessage:"Hallo",
                        userId:"3"
                    }
                ]
            },{
                id:"3",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"4",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"5",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"6",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"7",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"8",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"9",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"10",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"11",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"12",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"13",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"14",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"15",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"16",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"17",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"18",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"19",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"20",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"21",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"22",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            },{
                id:"23",
                name:"Test2 Chat",
                unreadMessages:true,
                loadingMessages:false,
                userIds:[
                    "1",
                    "3"
                ],
                messages:[
                ]
            }
        ]

    },
    mutations: {
        selectChanel(state,channelId) {
            state.currentChannelId = channelId;
            state.channels.find(channel => channel.id === channelId).unreadMessages = false;
        },
        sendMessage(state,message) {
            console.log(message);
            state.channels.find(channel => channel.id === state.currentChannelId).messages.push(
                {
                    cipherMessage:message,
                    userId:state.userId
                });
        },
        loadUser(userId){
            global.axiosInstance.get("/users/"+userId)
              .then((response)  =>  {
                state.users = state.users.filter(
                    user => user.id !== userId);
                state.users.push(response.data);
            }, (error)  =>  {
                console.log(error);
            });
        },
        loadChannel(channelId){
            global.axiosInstance.get("/channels/"+channelId)
              .then((response)  =>  {
                state.channels = channels.users.filter(
                    channel => channel.id !== channelId);
                state.channels.push(response.data);
            }, (error)  =>  {
                console.log(error);
            });
        },
        loadChannels(){
            this.state.loadChannels = true;
            global.axiosInstance.get("/channels"+"?selfId=1")
              .then((response)  =>  {
                this.state.loadChannels = false;
                this.state.channels = response.data;
            }, (error)  =>  {
                console.log(error);
                this.state.loadChannels = false;
            });
        },

    },
    actions: {
    }
})
