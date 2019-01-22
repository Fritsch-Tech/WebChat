import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        userId:"1",
        currentChannelId:"1",
        users:[
            {
                id:"1",
                name:"Lukas",
                avatar:require("./assets/images/avatar.jpg")
            },
            {
                id:"2",
                name:"Test1",
                avatar:require("./assets/images/avatar.jpg")
            },
            {
                id:"3",
                name:"Test2",
                avatar:require("./assets/images/avatar.jpg")
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
                    }
                ]
            },{
                id:"1",
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
                    }
                ]
            }
        ]

    },
    mutations: {
        selectChanel(state,chanelId) {
            state.currentChannelId = chanelId;
        }
    },
    actions: {

    }
})
