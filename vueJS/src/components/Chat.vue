<template>
    <div id="Chat">
        <div v-if="messages.length != 0">
            {{messages[0].channel.name}}
            {{messages[0].channel.id}}
        </div>
        <div id="Messages">
            <div id="MessageContainer" v-for="message in messages">
                <div id="Message">
                    {{message.cipherMessage}}
                </div>
            </div>
        </div>
        <div id="MessageInput">
            <b-input-group>
                <b-form-input   v-model="input.message"
                                type="text"
                                placeholder="Type a message">
                </b-form-input>
                <b-input-group-append>
                    <b-btn variant="outline-success" v-on:click="send()">Send</b-btn>
                </b-input-group-append>
            </b-input-group>
        </div>
    </div>
</template>

<script>
export default {
    data () {
        return {
            input:{
                message:""
            },
            loadingMessages:false,
            channelId:"1",
            messages:[]
        }
    },
    methods: {
        loadMessages(){
            this.loadingMessages = true;
            global.axiosInstance.get("/chat/"+this.channelId)
            .then((response)  =>  {
                this.loadingMessages = false;
                this.messages  = response.data;

            }, (error)  =>  {
                console.log(error);
                this.loadingMessages = false;
            });
        },
        send(){
            if(this.input.message != ""){
                global.axiosInstance.post("/chat/"+this.channelId)
                .then((response)  =>  {
                }, (error)  =>  {
                    console.log(error);
                });
                this.messages.push({"cipherMessage":this.input.message});
                this.input.message == "s";
            }
        }
    },
    mounted(){
        this.loadMessages();
    }

}
</script>
