<template>
    <div id="Chat" height="100%">
        <v-toolbar dense>
            <v-avatar
                v-if="channels.length !== 0"
                :size="40">
                <img :src="
                users.find(user => user.id ===
                        channels.find(channel => channel.id === currentChannelId)
                    .userIds.find(id => id !== userId)).avatar">
            </v-avatar>
            <v-toolbar-title>
                <div v-if="channels.length !== 0">
                    {{channels.find(channel =>
                        channel.id === currentChannelId).name}}
                </div>
                <div v-else>

                </div>
            </v-toolbar-title>
        </v-toolbar>

        <v-sheet
            id="Messages"
            v-chat-scroll
            min-height="650px"
            max-height="650px"
            style="overflow-y:scroll">
            <v-list
                v-if="channels.length !== 0"
                two-line>
                <v-list-tile
                v-for="message in channels.find(channel =>
                    channel.id === currentChannelId).messages"
                avatar
                @click="">
                    <v-list-tile-avatar>
                        <img :src="users.find(user =>
                            user.id === message.userId).avatar">
                    </v-list-tile-avatar>

                    <v-list-tile-content>
                        <v-list-tile-title class="blue--text">
                            {{users.find(user =>
                                user.id === message.userId).name}}
                        </v-list-tile-title>
                        <v-list-tile-sub-title>{{message.cipherMessage}}</v-list-tile-sub-title>
                    </v-list-tile-content>
                </v-list-tile>
            </v-list>
        </v-sheet>
        <v-textarea
            align-end justify-end
            background-color="grey darken-2"
            @keyup.enter.exact="sendMessage()"
            style="
                position: absolute;
                bottom:0px;
                right:15px;
                left:15px;"
            v-model="input.message"
            placeholder="Write a message...">
        </v-textarea>
    </div>
</template>

<script>
export default {
    data () {
        return {
            input:{
                message:""
            }
        }
    },
    methods: {
        sendMessage(){
            if(this.trim(this.input.message) != ''){
                this.$store.commit('sendMessage',this.input.message);
                var messages = this.$el.querySelector("#Messages");
                messages.scrollTop = messages.clientHeight;
            }
            this.input.message = '';

        },
        trim(str) {
            return str.replace(/^\s+|\s+$/g, "");
        }
    },
    computed:{
        currentChannelId(){
            return this.$store.state.currentChannelId;
        },
        channels(){
            return this.$store.state.channels;
        },
        users(){
            return this.$store.state.users;
        },
        userId(){
            return this.$store.state.userId;
        }
    }
}
</script>
